import java.util.Scanner;

public class OptionSelection {
    static char getSelection () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Select an option: ");
        return (char) scanner.nextLine().trim().toUpperCase().charAt(0);
    }
}
