package Com.Ransom.DentalMange.DB;

import Com.Ransom.DentalMange.Model.Appoinment;
import Com.Ransom.DentalMange.Model.Patient;
import Com.Ransom.DentalMange.Model.PatientTable;
import Com.Ransom.DentalMange.Model.Payment;
import Com.Ransom.DentalMange.Utill.Security.PasswordManger;

import java.util.ArrayList;

public class Database {
    public static ArrayList<Patient>Patienttable=new ArrayList();

static {
    Patienttable.add(new Patient("sandalu",
            "ekanayaka","sandaluthushan20@gmail.com",
            new PasswordManger().encryption("Thush@12213")
            ));

}
    public static ArrayList<Appoinment>appoinmentstable=new ArrayList();
    public  static ArrayList<Payment>paymentstable=new ArrayList();
    public  static ArrayList<PatientTable>Patienttabletable=new ArrayList();
}
