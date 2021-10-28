package Employee;

public class Programmer extends Employee{

    private String IDE;

    public String getIDE() {

        return IDE;
    }

    public void setIDE(String IDE) {

        this.IDE = IDE;
    }

    public Programmer() {
    }

    public void makeProgram() {

        System.out.println("A programmer makes applications");
    }



    public Programmer(int number, String name, int salary, int age, String IDE) {
        super(number, name, salary, age);
        this.IDE = IDE;
    }


    public String toString() {

        return "IDE: " + IDE + super.toString();
    }
}
