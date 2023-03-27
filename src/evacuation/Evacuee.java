package evacuation;

public class Evacuee implements Comparable<Evacuee> {
    private String firstName;
    private String lastName;
    private int gender;
    private int age;
    private int income;

    // empty constructor
    public Evacuee (){

    }

    // another constructor
    public Evacuee(String firstName, String lastName, int gender, int age, int income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.income = income;
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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public String toString() {

        String g = "";
        if (gender == 1)
            g = "Male";
        else if (gender == 2)
            g = "Female";

        return firstName + " " + lastName + " (" +
                g +
                ", age " + age +
                ", income $" + income +
                ")";
    }

    @Override
    public int compareTo(Evacuee o) {
        return 0;
    }
} // end class Evacuee
