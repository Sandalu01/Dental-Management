package Com.Ransom.DentalMange.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DoctorsFormController {
    public AnchorPane Doccontext;

    public void D1SelectionOnAction(ActionEvent actionEvent) {
    }

    public void D2SelectionOnAction(ActionEvent actionEvent) {
    }

    public void D3SelectionOnAction(ActionEvent actionEvent) {
    }

    public void D4SelectOnaction(ActionEvent actionEvent) {
    }
    public void Bsck2Dashboard(ActionEvent actionEvent) throws IOException {
        setui("DashBoard");
    }
    private void setui(String location) throws IOException
    {
        Stage stage=(Stage)Doccontext.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../View/"+location+".fxml"))
        ));
        stage.centerOnScreen();

    }


}
