package oops.Contact;

public class Contact {
    private String firstName, lastName;
    private String phoneNumber;

    public Contact() {

    }

    public Contact(String firstName, String lastName, String phoneNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
        // this.firstName = firstName;
        // this.lastName = lastName;
        // this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = capitalizedFirstCharacterOfSring(firstName);
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = capitalizedFirstCharacterOfSring(lastName);
    }

    public String getPhoneNumber() {
        return this.prettyFormatPhoneNumber();
    }
    public void setPhoneNumber(String phoneNumber) {
        // \D -> non numeric character
        // แทนที่ตัวอักษรที่กำหนด เมื่อตัวนั้นเข้าเงือนไขของ regex 
        this.phoneNumber = phoneNumber.replaceAll("[\\D]", "");
    }

    public String capitalizedFirstCharacterOfSring(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    
    public String prettyFormatPhoneNumber() {
        return this.phoneNumber.replaceAll("(\\d{2})(\\d{4})(\\d{4})", "$1-$2 $3");
    }

    @Override
    public String toString() {
        return String.format("Fullname: %s, Phone number: %s", (this.firstName + " " + this.lastName), this.phoneNumber);
    }
}
