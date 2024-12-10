public class BankAccount {

    private String owner_name;
    private int owner_age;
    private String password;
    private int balance;
    private String history_of_transactions;
    
    String array[] = new String[3];

    private String displayOwnerInfo() {
        return this.owner_name + " " + this.owner_age;
    }

    private int displayBalance() {
        return balance;
    }

    private void depositMoney(int amount) {
        this.balance += amount;
        
    }

    private void withdrawMoney(int amount) {
        if (amount > this.balance) {
            System.out.println("Not enough money");
        }

        else if (amount > 500) {
            System.out.println("Cannot withdraw more than 500 PLN");
        }

        else {
            this.balance -= amount;
        }
    }

}