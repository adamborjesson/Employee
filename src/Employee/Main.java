package Employee;

import static Employee.EmployeeManagement.*;

public class Main {
   // static Scanner sc = new Scanner(System.in);
    //static EmployeeManagement e2 = new EmployeeManagement();

    public static void main(String[] args) {


        boolean mainLoop = true;
        while (mainLoop) {
            int choice = UI.mainMenu();
            switch (choice) {

                case 1 -> menu();

                case 2 -> menu2();

                case 0 -> mainLoop = false;

                default -> System.out.println("There is no such option");
            }
        }

    }

    private static void menu() {

        boolean loop2 = true;
        while (loop2) {
            int choice = UI.manageEmployee();
            switch (choice) {

                case 1 -> registerEmployee();

                case 2 -> deleteEmployee();

                case 3 -> displayProgrammers();

                case 4 -> displayComputerBuilders();

                case 5 -> typeOfEmployee();

                case 6 -> employeeSpecifics();

                case 0 -> loop2 = false;

                default -> System.out.println("There is no such option");
            }

        }
    }

    public static void menu2() {
        boolean loop = true;
        while (loop) {

            int choice = UI.statistics();

            switch (choice) {

                case 1 -> updateSalary();

                case 2 -> maxSalary();

                case 3 -> averageAgeOfProgrammers();

                case 4-> incomePerYear();

                case 5-> sortByName();

                case 6 -> sortByAge();

                case 7 -> sortBySalary();

                case 0 -> loop = false;

                default -> System.out.println("There is no such option");

            }
        }
    }
}





