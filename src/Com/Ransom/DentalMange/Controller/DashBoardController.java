package Com.Ransom.DentalMange.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DashBoardController {

    public AnchorPane Dashboardcontext;
    public Label lbldate;
    public Label lbltime;


 public void initialize(){
     SetDataandtime();
 }

    private void SetDataandtime() {

        lbldate.setText(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        lbltime.setText(new SimpleDateFormat("HH-mm-ss ").format(new Date())) ;

    }


    private void SetData(){

        Date date =new Date();//utill
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String textdata=dateFormat.format(date);
        lbldate.setText(textdata);






    }


    public void PatientOnAction(ActionEvent actionEvent) throws IOException {
        setui("PatientForm");
    }

    public void DoctorOnAction(ActionEvent actionEvent) throws IOException {
        setui("DoctorsForm");
    }

    public void AppoinmentOnaction(ActionEvent actionEvent) throws IOException {
        setui("AppoinmentForm");
    }

    public void NewregistartionOnAction(ActionEvent actionEvent) throws IOException {
        setui("PatientForm");
    }

    public void PaymentOnAction(ActionEvent actionEvent) throws IOException {
        setui("PaymentForm");
    }



    public void LogOutOnAction(ActionEvent actionEvent) throws IOException {
        setui("LoginForm");
    }
    private void setui(String location) throws IOException
    {
        Stage stage=(Stage)Dashboardcontext.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../View/"+location+".fxml"))
        ));
        stage.centerOnScreen();

    }


}
