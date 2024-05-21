package Com.Ransom.DentalMange.Controller;

import Com.Ransom.DentalMange.DB.Database;
import Com.Ransom.DentalMange.Model.Patient;
import Com.Ransom.DentalMange.Utill.Security.PasswordManger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class LoginFormController {
    @FXML
    private AnchorPane logincontext;
    @FXML
    private TextField emailtxt;
    @FXML
    private PasswordField passwordtxt;



    public void LoginOnAction(ActionEvent actionEvent) throws IOException {
        String email = emailtxt.getText().toLowerCase();
        String password = passwordtxt.getText().trim();
        Optional<Patient> selected = Database.Patienttable.stream().filter(user -> user.getEmail().equals(email)).findFirst();
        if(selected.isPresent()){
           if(new PasswordManger().chekpassword(password,selected.get().getPasseword())){
               System.out.println(selected.get().toString());
               setui("DashBoard");
           }
           else {
               new Alert(Alert.AlertType.ERROR,
                       "Wrong password").show();

           }
            }
        else{
            new Alert(Alert.AlertType.WARNING,
                    String.format("user not found", email)).show();

        }


        // Logic

    }

    public void CreateanaccountOnAction(ActionEvent actionEvent) throws IOException {
        setui("SignUpForm");

    }
    private void setui(String location) throws IOException
    {
        Stage stage=(Stage)logincontext.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../View/"+location+".fxml"))
        ));
        stage.centerOnScreen();
    }

    public void fogotpasswordOnactipn(ActionEvent actionEvent) {
    }




}
