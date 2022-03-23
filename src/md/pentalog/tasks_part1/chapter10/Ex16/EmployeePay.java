package md.pentalog.tasks_part1.chapter10.Ex16;

public abstract class EmployeePay implements Payable{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public EmployeePay(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return String.format(("%s %s%nsocial security number: "), getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    public abstract double earnings();
}
