package bank;

import user.User;

public class BankAccount {
    
    private int id;
    
    private int balance;
    
    private User user;
    
    public BankAccount(int id, int balance, User user) {
        this.id = id;
        this.balance = balance;
        this.user = user;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getBalance() {
        return balance;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public User getUser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
}
