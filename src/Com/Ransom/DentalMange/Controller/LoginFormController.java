package Com.Ransom.DentalMange.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public AnchorPane logincontext;
    public TextField emailtxt;
    public PasswordField passwordtxt;

    public void LoginOnAction(ActionEvent actionEvent) {
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
