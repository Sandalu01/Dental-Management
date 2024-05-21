package Com.Ransom.DentalMange.Model;

import javafx.scene.input.DataFormat;

public class PatientTable {

    private String Fullname;
    private String Address ;
    private String Telephone_no;
    private String dataofbirth;
    private String registerid;

    public PatientTable() {
    }

    public PatientTable(String fullname, String address, String telephone_no, String dataofbirth, String registerid) {
        this.Fullname = fullname;
        this.Address = address;
        this.Telephone_no = telephone_no;
        this.dataofbirth = dataofbirth;
        this.registerid = registerid;
    }


    public PatientTable(String format, String text, String text1, String text2) {
    }


    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String fullname) {
        Fullname = fullname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getTelephone_no() {
        return Telephone_no;
    }

    public void setTelephone_no(String telephone_no) {
        Telephone_no = telephone_no;
    }

    public String getDataofbirth() {
        return dataofbirth;
    }

    public void setDataofbirth(String dataofbirth) {
        this.dataofbirth = dataofbirth;
    }

    public String getregisterid() {
        return registerid;
    }

    public void setregisterid(String registerid) {
        this.registerid = registerid;
    }
}
