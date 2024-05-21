package Com.Ransom.DentalMange.View.Tm;

import javafx.scene.control.Button;

public class PatientTm {
    private String Name;
    private String registerid;
    private String Telephone;
    private String optional;
    private String Address;

    private Button btn;

    public PatientTm() {
    }

    public PatientTm(String name, String registerid, String telephone, String optional, String address) {
        this.Name = name;
        this.registerid = registerid;
        this.Telephone = telephone;
        this.optional = optional;
        this.Address = address;
    }

    public PatientTm(String fullname, String telephoneNo, String address, String format, Button btn,String registerid) {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getregisterid() {
        return registerid;
    }

    public void setregisterid(String regno) {
        registerid = regno;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getOptional() {
        return optional;
    }

    public void setOptional(String optional) {
        this.optional = optional;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
    @Override
    public String toString() {
        return "PatientTm{" +
                "Name='" + Name + '\'' +
                ", Regno='" + registerid + '\'' +
                ", Telephone='" + Telephone + '\'' +
                ", optional='" + optional + '\'' +
                ", Address='" + Address + '\'' +
                ", btn=" + btn +
                '}';
    }
}
