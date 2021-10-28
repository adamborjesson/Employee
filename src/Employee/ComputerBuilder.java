package Employee;

public class ComputerBuilder extends Employee{
    private String computer;

    public String getComputer() {

        return computer;
    }

    public void setComputer(String computer) {

        this.computer = computer;
    }

    public ComputerBuilder() {

    }

    public ComputerBuilder(int number, String name, int salary, int age, String computer) {
        super(number, name, salary, age);
        this.computer = computer;
    }

    public void makeProgram() {

        System.out.println("A computerbuilder makes computers");
    }


    public String toString() {

        return "Computer: " + computer + super.toString();
    }
}
