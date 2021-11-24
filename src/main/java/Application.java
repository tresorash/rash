import bank.BankAccount;
import user.User;

public class Application {

    public static void main(String[] args) {
        
        User user = new User(1, "Kelig", 24);
        User user2 = new User(1, "Kelig", 24);
        
        BankAccount bankAccount = new BankAccount(7854248, 10000, user);
        
        user.withdraw(bankAccount, 11000);
        user2.withdraw(bankAccount, 500);
        System.out.println(bankAccount.getBalance());
    }

}
