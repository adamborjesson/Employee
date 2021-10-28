package Employee;

import java.util.Scanner;

public class Utilities {
    static Scanner sc = new Scanner(System.in);

    public static int intInput() {
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    public static String stringInput() {
        String choice = sc.nextLine();
        return choice;
    }
}
