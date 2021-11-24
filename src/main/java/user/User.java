package user;

import bank.BankAccount;

public class User {
    
    private int id;
    
    private String username;
    
    private int age;
    
    public User(int id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUser(String username) {
        this.username = username;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    
    public void withdraw(BankAccount bankAccount, int amount) {
        if(amount > 0) {
            int initialAmount = bankAccount.getBalance(); // permet d'accéder au solde du compte en banque
            int newAmount = initialAmount - amount;
            if (this.age >= 18) {
                bankAccount.setBalance(newAmount);
            }
            else {
                if(newAmount >= 0) {
                    bankAccount.setBalance(newAmount);
                }
            }
             // remplace l'ancien montant (10 000) par le nouveau (10)
        }
    }
    
    public void deposit(BankAccount bankAccount, int amount) {
        if(amount > 0) {
            int initialAmount = bankAccount.getBalance(); // permet d'accéder au solde du compte en banque
            int newAmount = initialAmount + amount;
            bankAccount.setBalance(newAmount);
             // remplace l'ancien montant (10 000) par le nouveau (10)
        }
    }
}