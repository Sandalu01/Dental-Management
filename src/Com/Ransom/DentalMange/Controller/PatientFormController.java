package Com.Ransom.DentalMange.Controller;

import Com.Ransom.DentalMange.DB.Database;

import Com.Ransom.DentalMange.Model.Patient;
import Com.Ransom.DentalMange.Model.PatientTable;
import Com.Ransom.DentalMange.View.Tm.PatientTm;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class PatientFormController {

    public AnchorPane Patientcontext;
    public TextField fullnametxt;
    public TextField searchtxt;
    public DatePicker dobtxt;
    public TextField telephonetxt;
    public TextField addresstxt;

    public TextField regnotxt;
    public TableView <PatientTm> tblview;
    public TableColumn colRegno;
    public TableColumn colName;
    public TableColumn colTelphone;
    public TableColumn colOptional;
    public TableColumn colAddress;


    public void initialize(){
        // table data loading into view

        colRegno.setCellFactory(new PropertyValueFactory<>("registerid"));
        colName.setCellFactory(new PropertyValueFactory<>("Name"));
        colAddress.setCellFactory(new PropertyValueFactory<>("Address"));
        colOptional.setCellFactory(new PropertyValueFactory<>("btn"));
        colTelphone.setCellFactory(new PropertyValueFactory<>("Telephone"));
        SetPatientRegistration();
        SettableData();

    }

    private void SettableData() {
        ObservableList<PatientTm> oblist= FXCollections.observableArrayList();
        for (PatientTable patient:Database.Patienttabletable) {
            Button btn=new Button("Delete");
        PatientTm Tm =new PatientTm(
                patient.getFullname(),patient.getTelephone_no(), patient.getAddress(),
                new SimpleDateFormat("yyyy-MM-dd").format(patient.getDataofbirth()),
                btn,
                patient.getregisterid()
        );
        oblist.add(Tm);
        }
        tblview.setItems(oblist);
    }

    private void SetPatientRegistration() {
        if (!Database.Patienttabletable.isEmpty()){
            //Anonymous inner class

            //Database.Patienttabletable patientTable = Database.Patienttabletable.get(Database.Patienttabletable.size()-1);

            PatientTable lastpatient =Database.Patienttabletable.get(
                    Database.Patienttabletable.size()-1);
            String lastid= lastpatient.getregisterid();
            String splitdata[]=lastid.split("-");
            String lastidasint=splitdata[1];
            int lastintidasint=Integer.parseInt(lastidasint);
            lastintidasint++;
            String geneartedregno="P-"+lastintidasint;
            regnotxt.setText(geneartedregno);
            //it can be optimized as Anonymous inner class
            //split==> string array==> string values is converted to the int value and increment by one

        }else {
            regnotxt.setText("P-1");
        };
    }

    public void SavePatientOnactipn(ActionEvent actionEvent) throws IOException {
        PatientTable patientTable=new PatientTable(
                dobtxt.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")),
                addresstxt.getText(),
                fullnametxt.getText(),
                telephonetxt.getText(),
                regnotxt.getText()

        );
        Database.Patienttabletable.add(patientTable);
        new Alert(Alert.AlertType.CONFIRMATION,"new patient has been added").show();
        SetPatientRegistration();
        clear();
        SettableData();
        setui("DashBoard");

    }

    public void Back2DashOnaction(ActionEvent actionEvent) throws IOException {
        //no  logic
        setui("DashBoard");
    }
    private void setui(String location) throws IOException
    {
        Stage stage=(Stage)Patientcontext.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../View/"+location+".fxml"))
        ));
        stage.centerOnScreen();

    }

    private void clear(){
        dobtxt.setValue(null);
        fullnametxt.clear();
        addresstxt.clear();
    }
}
