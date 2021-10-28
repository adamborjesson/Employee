package Employee;

public class Employee implements Comparable<Employee>{

    private int number;
    private String name;
    private int salary;
    private int age;
    private int YearlySalary;
    private int choice1;
    private int choice2;

    public Employee() {
    }

    public Employee(int number, String name, int salary, int age) {
        this.number = number;
        this.name = name;
        this.salary = salary;
        this.age = age;

    }

    public int getChoice2() {
        return choice2;
    }

    public void setChoice2(int choice2) {
        this.choice2 = choice2;
    }

    public int getChoice1() {

        return choice1;
    }

    public void setChoice1(int choice1) {

        this.choice1 = choice1;
    }

    public int getYearlySalary() {

        return YearlySalary;
    }

    public void setYearlySalary(int yearlySalary) {

        YearlySalary = yearlySalary;
    }

    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getSalary() {

        return salary;
    }

    public void setSalary(int salary) {

        this.salary = salary;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void makeProgram() {
    }

    public String toString() {
        return " number: " + number +
                " name: " + name +
                " salary: " + salary +
                " age: " + age;

    }


    public int compareTo(Employee o) {
        if(this.getAge() > o.getAge()) {
            return 1;
        }else if(this.getAge() == o.getAge()) {
            return 0;
        }else
            return -1;
    }


}
