package Employee;


import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;

public class EmployeeManagement {


    //static Scanner sc = new Scanner(System.in);
    static Employee e = new Employee();
    static Utilities u = new Utilities();


    static ArrayList<Employee> list = new ArrayList<>();
    static ArrayList<Employee> list2 = new ArrayList<>();


    public static void registerEmployee() {


        System.out.println("""
                Type of employee
                                
                1. Programmer
                2. Computerbuilder
                """);
        int choice = u.intInput();

        switch (choice) {
            case 1:

                Programmer p = new Programmer();
                System.out.print("Name of IDE: ");
                p.setIDE(u.stringInput());
                createEmployee();
                Programmer p2 = new Programmer(e.getNumber(), e.getName(), e.getSalary(), e.getAge(), p.getIDE());
                list.add(p2);

                break;
            case 2:
                ComputerBuilder c = new ComputerBuilder();
                System.out.print("Type of computer: ");
                c.setComputer(u.stringInput());
                createEmployee();
                ComputerBuilder c2 = new ComputerBuilder(e.getNumber(), e.getName(), e.getSalary(), e.getAge(), c.getComputer());
                list.add(c2);

                break;
        }


    }

    private static void createEmployee() {

        System.out.print("Number: ");
        e.setNumber(u.intInput());

        System.out.print("Name: ");
        e.setName(u.stringInput());

        System.out.print("Salary: ");
        e.setSalary(u.intInput());

        System.out.print("Age: ");
        e.setAge(u.intInput());

    }

    public static void deleteEmployee() {
        System.out.println("Which number");
        int number = u.intInput();



        list.stream()
                .filter(e -> e.getNumber() == number)
                .forEach(e -> System.out.println("Employee "+e.getNumber()+" is removed"));

        list.stream()
                .filter(e -> e.getNumber() != number)
                .forEach(EmployeeManagement::employeeIsRemoved);

        list.removeAll(list);
        list.addAll(list2);
        list2.removeAll(list2);
    }



    public static void employeeIsRemoved(Employee e) {

        list2.add(e);


    }

    public static void displayProgrammers() {


                list.stream()
                        .filter(e -> e instanceof Programmer)
                        .forEach(System.out::println);

                }

    public static void displayComputerBuilders() {

        list.stream()
                .filter(e -> e instanceof ComputerBuilder)
                .forEach(System.out::println);

    }


    public static void updateSalary() {
        System.out.println("Which number");
        int number = u.intInput();
        System.out.println("New salary");
        int salary = u.intInput();

        list.stream()
                .filter(e -> e.getNumber() == number)
                .forEach(e -> e.setSalary(salary));
    }


    public static void maxSalary() {

        DoubleSummaryStatistics stat = list.stream()
                .map(e -> e.getSalary())
                .mapToDouble(e -> e)
        .summaryStatistics();
        System.out.println(stat.getMax());
    }

    public static void averageAgeOfProgrammers() {
        DoubleSummaryStatistics stat = list.stream()
                .filter(e -> e instanceof Programmer)
                .map(e -> e.getAge())
                .mapToDouble(e -> e)
        .summaryStatistics();
        System.out.println(stat.getAverage());
    }


    public static void typeOfEmployee() {
        System.out.println("""
                Choose type of employee
                                
                1. Programmer
                2. Computer Builder
                """);

        int choice = u.intInput();
        switch (choice) {
        case 1 ->

        list.stream()
                .filter(e -> e instanceof Programmer)
                .forEach(Employee::makeProgram);

        case 2 ->
        list.stream()
                .filter(e -> e instanceof ComputerBuilder)
                .forEach(Employee::makeProgram);

    }

    }

    public static void employeeSpecifics() {
        System.out.println("""
                Type of employee
                
                1.Programmer
                2.Computerbuilder
                """);

        int choice = u.intInput();

        switch(choice) {
            case 1 ->
            list.stream()
                    .filter(e -> e instanceof Programmer)
                    .forEach(e -> System.out.println("Programmer " + e.getNumber() + " works with " + ((Programmer) e).getIDE()));

            case 2 ->
            list.stream()
                    .filter(e -> e instanceof ComputerBuilder)
                    .forEach(e -> System.out.println("Computer builder "+e.getNumber()+" makes "+((ComputerBuilder) e).getComputer()));
        }
    }

    public static void incomePerYear() {
        System.out.println("Which number");
        int number = u.intInput();
        list.stream()
                .filter(e -> e.getNumber() == number)
                .forEach(EmployeeManagement::calculateSalary);
    }

    private static void calculateSalary(Employee e) {
        System.out.println("Decide bonus for employee number "+e.getNumber());
        int bonus = u.intInput();
        int i = e.getSalary() * 12 +bonus;
        System.out.println("Employee number "+e.getNumber()+" makes "+i+" per year");
    }

    public static void sortByName() {
        System.out.println("""
                Ascending or descending
                
                1. Ascending
                2. Descending
                
                """);

        int choice = u.intInput();
        e.setChoice1(1);
        e.setChoice2(2);

        switch(choice) {
            case 1 ->
            list.stream()
                    .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                    .forEach(EmployeeManagement::addToList);

            case 2 ->
       list.stream()
               .sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
               .forEach(EmployeeManagement::addToList);
        }
        Collections.copy(list, list2);
        list2.removeAll(list2);

    }

    public static void addToList(Employee e) {

        list2.add(e);

    }


    public static void sortByAge() {
       list.stream()
               .sorted((e1, e2) -> e1.getAge() - e2.getAge())
               .forEach(EmployeeManagement::addToList);
        Collections.copy(list, list2);
        list2.removeAll(list2);
    }


    public static void sortBySalary() {

        list.stream()
                .sorted((e1, e2) -> e1.getSalary() - e2.getSalary())
                .forEach(EmployeeManagement::addToList);
        Collections.copy(list, list2);
        list2.removeAll(list2);
    }

    }



