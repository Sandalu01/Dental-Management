package Com.Ransom.DentalMange.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
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

    public void SignUpOnaction(ActionEvent actionEvent) {
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