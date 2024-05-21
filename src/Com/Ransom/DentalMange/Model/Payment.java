package Com.Ransom.DentalMange.Model;

public class Payment {
    private String Name;
    private String Homephone;
    private String Address;
    private String postalcode;
    private String cardnumber;

    public Payment() {



    }

    public Payment(String name, String homephone, String address, String postalcode, String cardnumber) {
        this.Name = name;
        this.Homephone = homephone;
        this.Address = address;
        this.postalcode = postalcode;
        this.cardnumber = cardnumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getHomephone() {
        return Homephone;
    }

    public void setHomephone(String homephone) {
        Homephone = homephone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }
    @Override
    public String toString() {
        return "Payment{" +
                "Name='" + Name + '\'' +
                ", Homephone='" + Homephone + '\'' +
                ", Address='" + Address + '\'' +
                ", postalcode='" + postalcode + '\'' +
                ", cardnumber='" + cardnumber + '\'' +
                '}';
    }
}
