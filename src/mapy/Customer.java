package mapy;

public class Customer {
    private long id;
    private String firstName;
    private String lastName;
    private int phoneNumber;

    public Customer(long id, String firstName, String lastName, int phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                id + " " +
                "firstName= " + firstName + '\'' +
                ", lastName= " + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }


    public long setId() {
        return this.id = id;
    }
}
