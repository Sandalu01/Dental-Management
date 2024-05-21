package Com.Ransom.DentalMange.Controller;

import Com.Ransom.DentalMange.DB.Database;
import Com.Ransom.DentalMange.Model.Payment;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PaymentFormController {
    public AnchorPane paymentcontext;
    public TextField nametxt;
    public TextField homephonetxt;
    public TextField addresstxt;
    public TextField postaltxt;
    public TextField cardnumbertxt;

    public void PayOnAction(ActionEvent actionEvent) throws IOException {

        String Name=nametxt.getText().toLowerCase();
        String address=addresstxt.getText().toLowerCase();
        String Homephone=homephonetxt.getText();
        String postalcode=postaltxt.getText().trim();
        String cardnumber=cardnumbertxt.getText().trim();
        Database.paymentstable.add(new Payment(Name,address,Homephone,postalcode,cardnumber));
        new Alert(Alert.AlertType.CONFIRMATION,"your payment sucessfully").show();
        setui("DashBoard");
       //  inner  Annonymus class  has been added

    }


    public void backtodashboardOnAction(ActionEvent actionEvent) throws IOException {
        setui("DashBoard");
    }

    private void setui(String location) throws IOException
    {
        Stage stage=(Stage)paymentcontext.getScene().getWindow();
        stage.setScene(new Scene(
                FXMLLoader.load(getClass().getResource("../View/"+location+".fxml"))
        ));
        stage.centerOnScreen();

    }

}
