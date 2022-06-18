package composition.phonebook;

public class Contact {

    private final String firstName;
    private final String secondName;
    private final String phoneNumber;
    public String additionalInfo;

    public Contact(String firstName, String secondName, String phoneNumber, String additionalInfo) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.additionalInfo = additionalInfo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @Override
    public String toString() {
        return  firstName + " " + secondName + ", " +
                phoneNumber + ", " +
                additionalInfo ;
    }
}
