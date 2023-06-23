package gr.aueb.cf.model;

public class User extends IdentifiableEntity {
    private String firstname;
    private String lastname;
    private String ssn;

    public User() {}

    public User(String firstname, String lastname, String Ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = Ssn;
    }

    //Copy Constructor
    public User(User user) {
        firstname = user.getFirstname();
        lastname = user.getLastname();
        ssn = user.getSsn();

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String Ssn) {
        ssn = Ssn;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", Ssn='" + ssn + '\'' +
                '}';
    }
}
