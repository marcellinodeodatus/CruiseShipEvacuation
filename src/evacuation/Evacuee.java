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
    public int compareTo(Evacuee other) {
        // Children first
        if (this.age < 18 && other.age >= 18) {
            return -1;
        } else if (this.age >= 18 && other.age < 18) {
            return 1;
        } else if (this.age < 18 && other.age < 18) {
            // Younger children first
            if (this.age < other.age) {
                return -1;
            } else if (this.age > other.age) {
                return 1;
            } else {
                // Same age, compare last names
                int cmp = this.lastName.compareTo(other.lastName);
                if (cmp != 0) {
                    return cmp;
                } else {
                    // Same last name, compare first names
                    return this.firstName.compareTo(other.firstName);
                }
            }
        } else {
            // Adults, women first
            if (this.gender == 2 && other.gender != 2) {
                return -1;
            } else if (this.gender != 2 && other.gender == 1) {
                return 1;
            } else if (this.gender == 2 && other.gender == 2) {
                // Women, richer first
                if (this.income > other.income) {
                    return -1;
                } else if (this.income < other.income) {
                    return 1;
                } else {
                    // Same income, compare last names
                    int cmp = this.lastName.compareTo(other.lastName);
                    if (cmp != 0) {
                        return cmp;
                    } else {
                        // Same last name, compare first names
                        return this.firstName.compareTo(other.firstName);
                    }
                }
            } else {
                // Men, richer first
                if (this.income > other.income) {
                    return -1;
                } else if (this.income < other.income) {
                    return 1;
                } else {
                    // Same income, compare last names
                    int cmp = this.lastName.compareTo(other.lastName);
                    if (cmp != 0) {
                        return cmp;
                    } else {
                        // Same last name, compare first names
                        return this.firstName.compareTo(other.firstName);
                    }
                }
            }
        }
    }
} // end class Evacuee
