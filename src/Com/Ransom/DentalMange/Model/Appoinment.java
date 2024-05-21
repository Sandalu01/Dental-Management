package Com.Ransom.DentalMange.Model;

public class Appoinment {
    private String firstName;
    private String email;
    private String avalabletime;
    private String phone;
    private String availabledate;

    public Appoinment() {
    }

    public Appoinment(String firstName, String email, String avalabletime, String phone, String availabledate) {
        this.firstName = firstName;
        this.email = email;
        this.avalabletime = avalabletime;
        this.phone = phone;
        this.availabledate = availabledate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvalabletime() {
        return avalabletime;
    }

    public void setAvalabletime(String avalabletime) {
        this.avalabletime = avalabletime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvailabledate() {
        return availabledate;
    }

    public void setAvailabledate(String availabledate) {
        this.availabledate = availabledate;
    }

    @Override
    public String toString() {
        return "Appoinment{" +
                "firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", avalabletime='" + avalabletime + '\'' +
                ", phone='" + phone + '\'' +
                ", availabledate='" + availabledate + '\'' +
                '}';
    }
}
