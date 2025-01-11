public class Account {
    private String accountHolder;
    private int balance;
    private String accountId;

    public Account(String accountHolder, int initialBalance, String accountId) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.accountId = accountId;
    }

    public int getBalance() {
        return balance;
    }

    public void transferAmount(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough balance for this transfer.");
        }
        balance -= amount;
        System.out.println("Transfer of " + amount + " zł completed.");
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
