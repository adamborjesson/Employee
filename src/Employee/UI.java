package Employee;

public class UI {

    static Utilities u = new Utilities();

    public static int mainMenu() {

        System.out.println("""
                
                1. Manage employee
                2. Employee statistics
                0. Exit
                """);

        int choice = u.intInput();
        return choice;
    }

    public static int manageEmployee() {

        System.out.println("""
                1. Register employee
                2. Delete employee
                3. Display Programmers
                4. Display Computer Builders
                5. Role of employee
                6. Employee type specifics
                0. Back to main menu
                """);
        int choice = u.intInput();

        return choice;
    }

    public static int statistics() {
        System.out.println("""
                
                1. Update salary of employee
                2. Max salary of employee
                3. Average age of programmers 
                4. Income per year
                5. Sort employees by name
                6. Sort employees by age
                7. Sort employees by salary
                0. Back to main menu     
                
                """);

        int choice = u.intInput();
        return choice;

    }
}
