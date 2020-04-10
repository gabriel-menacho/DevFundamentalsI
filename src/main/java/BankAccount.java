public class BankAccount {

    private final String name;
    private final String account;
    private double total;

    public BankAccount(String name, String account) {
        this.name = name;
        this.account = account;
        this.total = 1000;
    }

    public String getName() {
        return name;
    }

    public String getAccount() {
        return account;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getBalance() {
        return getTotal();
    }

    public void withdraw() {
        double value = OptionSelection.getDouble();
        double currentTotal = getTotal();
        if (value <= currentTotal) {
            setTotal(currentTotal - value);
        } else {
            Utils.print("Not enough funds to make the operation");
        }
    }
}
