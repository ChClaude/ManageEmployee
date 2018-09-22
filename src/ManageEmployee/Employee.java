package ManageEmployee;

public class Employee extends Person implements Comparable<Employee> {

    private String salary;
    private String email;

    public Employee(String name, String surname, int birthYear, String salary, String email) {
        super(name, surname, birthYear);
        this.salary = salary;
        this.email = email;
    }

    // getters
    public String getSalary() {
        return salary;
    }

    // setters
    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthYear=" + birthYear+
                "salary='$" + salary + '\'' +
                ", email='" + email + '\'' +
                '}' + "\n";
    }

    @Override
    public int compareTo(Employee o) {
        int x;
        x = surname.compareTo(o.surname);

        // compares in case of same surname
        if (x == 0) {
            name.compareTo(o.name);
        }
        return x;
    }
}
