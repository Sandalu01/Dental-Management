package Com.Ransom.DentalMange.Model;

import java.util.Date;

public class Patient {
    private String firstName;
    private String LastName;
    private String  Email;
    private String Passeword;

    public Patient() {
    }

    public Patient(String firstName, String lastName, String email, String passeword) {
        this.firstName = firstName;
        this.LastName = lastName;
        this.Email = email;
        this.Passeword = passeword;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }



    public String getPasseword() {
        return Passeword;
    }

    public void setPasseword(String passeword) {
        Passeword = passeword;
    }
    @Override
    public String toString() {
        return "Patient{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", Passeword='" + Passeword + '\'' +
                '}';
    }
}
