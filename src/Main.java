public class Main {
    public static void main(String[] args) {
        Account account = new Account("Adan Nowak", 900, "123456799");

        double transferAmount = 600;
        try {
            account.transfer(transferAmount);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Another error occurred: " + e.getMessage());
        } finally {
            System.out.println("Current account balance: " + account.getBalance() + " zł.");
        }
    }
}
