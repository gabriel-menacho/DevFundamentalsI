import java.util.Scanner;

public class OptionSelection {
    static char getChar () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select an option: ");
        return (char) scanner.nextLine().trim().toUpperCase().charAt(0);
    }

    static double getDouble() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the value: ");
        return Double.parseDouble(scanner.nextLine());
    }
}
