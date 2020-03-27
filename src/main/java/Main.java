import java.util.Scanner;

public class Main {

    static void print (String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        // User details
        String name = "Jerry";
        String account = "BO10006789";
        // Welcome to the BankApp
        print("Welcome " + name);
        print("Your current account is " + account);
        // Main Menu
        print(System.lineSeparator());
        print("********************");
        print("(W) Withdraw");
        print("(D) Deposit");
        print("(B) My Balance");
        print("(T) My Transactions");
        print("(E) Exit");
        print("********************");
        // Press a key to select an option
        char option;
        do {
            option = OptionSelection.getSelection();
            switch (option) {
                case 'E':
                    print("Exit...");
                    break;
                default:
                    print(option + " is an invalid option");
                    break;
            }
            print(System.lineSeparator());
            print("(A) Show All options");
        } while (option != 'E');
    }
}
