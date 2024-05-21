package Com.Ransom.DentalMange.Controller;

import Com.Ransom.DentalMange.DB.Database;

import Com.Ransom.DentalMange.Model.Patient;

import Com.Ransom.DentalMange.Utill.Security.PasswordManger;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SignUpFormController {
    public AnchorPane Signupcontext;
    public TextField firsttxt;
    public TextField lasttxt;
    public TextField emailtxt;
    public TextField passwordtxt;

    public void SignUpOnaction(ActionEvent actionEvent) throws IOException {

        //after preparing the txt field of the signup form add array list of database class which  in DB package
        String email=emailtxt.getText().toLowerCase();
        String Firstname=firsttxt.getText();
        String lastname=lasttxt.getText();
        String password=new PasswordManger().encryption(passwordtxt.getText());
        Database.Patienttable.add(new Patient(email,Firstname,lastname,password));
        new Alert(Alert.AlertType.INFORMATION,"Welcome Sandalu Thushan ").show();
        //After filling the Array list auto navigation into the Login form with conformation massege
        SetUI("LoginForm");
    }

    public void AlreadyOnAction(ActionEvent actionEvent) throws IOException {
        SetUI("LoginForm");
    }


    private void SetUI(String location) throws IOException {
        Stage stage1 = (Stage) Signupcontext.getScene().getWindow();
        stage1.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../View/" + location + ".fxml"))
        ));
        stage1.centerOnScreen();

    }

}