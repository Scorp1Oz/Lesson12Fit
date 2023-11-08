import java.util.Calendar;
import java.util.GregorianCalendar;

public class FitnessTrackerUser {
    final private String firstName;
    private String lastName;
    final private int birthDay;
    final private int birthMonth;
    final private int birthYear;
    final private String email;
    final private String phone;
    private double weight;
    private String bloodPressure;
    private int stepsPerDay;
    private int age;

    public FitnessTrackerUser(String firstName, int birthDay, int birthMonth, int birthYear, String email, String phone) {
        this.firstName = firstName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.email = email;
        this.phone = phone;
        calculateAge();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }


    private void calculateAge() {
        Calendar currentDate = new GregorianCalendar();
        int currentYear = currentDate.get(Calendar.YEAR);
        age = currentYear - birthYear;
    }

    public void printAccountInfo() {
        System.out.println("First Name: " + firstName);
        if (lastName != null) {
            System.out.println("Last Name: " + lastName);
        }
        System.out.println("Birth Date: " + birthDay + "/" + birthMonth + "/" + birthYear);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight + " kg");
        if (bloodPressure != null) {
            System.out.println("Blood Pressure: " + bloodPressure);
        }
        System.out.println("Steps per Day: " + stepsPerDay);
        System.out.println();
    }
}
