public class Application {
    BankAccount bankAccount;

    public Application (String name, String account) {
        bankAccount = new BankAccount(name, account);
    }

    private void showMenu() {
        // Welcome to the BankApp
        Utils.print("Welcome " + bankAccount.getName());
        Utils.print("Your current account is " + bankAccount.getAccount());
        // Main Menu
        Utils.print(System.lineSeparator());
        Utils.print("********************");
        Utils.print("(W) Withdraw");
        Utils.print("(D) Deposit");
        Utils.print("(B) My Balance");
        Utils.print("(T) My Transactions");
        Utils.print("(E) Exit");
        Utils.print("********************");
    }

    private void selectOption() {
        // Press a key to select an option
        char option;
        do {
            option = OptionSelection.getChar();
            switch (option) {
                case 'W':
                    bankAccount.withdraw();
                    break;
                case 'B':
                    double total = bankAccount.getBalance();
                    Utils.print("Balance: " + total);
                    break;
                case 'E':
                    Utils.print("Exit...");
                    break;
                default:
                    Utils.print(option + " is an invalid option");
                    break;
            }
            Utils.print(System.lineSeparator());
            Utils.print("(A) Show All options");
        } while (option != 'E');
    }

    public void run() {
        showMenu();
        selectOption();
    }
}
