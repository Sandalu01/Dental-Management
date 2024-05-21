package Com.Ransom.DentalMange.Controller;

import Com.Ransom.DentalMange.DB.Database;
import Com.Ransom.DentalMange.Model.Appoinment;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AppoinmentFormController {


    public AnchorPane Appcontext;
    public TextField Nametxt;
    public TextField emailtxt;
    public TextField phonetxt;
    public TextField Availabletimetxt;
    public TextField availabletxt;

    public void SubmitOnAction(ActionEvent actionEvent) throws IOException {
        String Name=Nametxt.getText().toLowerCase();
        String email=emailtxt.getText().toLowerCase();
        String phone=phonetxt.getText();
        String avalabletime=Availabletimetxt.getText();
        String avalabledate=availabletxt.getText();
        Database.appoinmentstable.add(new Appoinment(Name,email,phone,avalabletime,avalabledate));
        new Alert(Alert.AlertType.CONFIRMATION,"Appointment sucessfull").show();
        setui("DashBoard");

    }



    public void backtodashboardONaction(ActionEvent actionEvent) throws IOException {
        setui("DashBoard");
    }
    private void setui(String location) throws IOException
    {
        Stage stage=(Stage)Appcontext.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../View/"+location+".fxml"))
        ));
        stage.centerOnScreen();

    }
}
