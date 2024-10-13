package bankAccount;
// balance, owner's name, dob
// deposit, withdraw, check balance

public class BankAccount {
    int balance;
    String nameOfOwner;
    String dateOfBirthOfOwner;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public int checkAmount() {
        return balance;
    }
}