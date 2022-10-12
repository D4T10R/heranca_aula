package entities;

public class Account {
    
     // ATRIBUCTOS 
    private Integer number;
    private String holder;
    protected Double balance;
     // ATRIBUCTOS
 
     // CONSTRUCTORS
    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }
     // CONSTRUCTORS

     // ENCAPSULAMENTOS
    public void setNumber(Integer number) {
        this.number = number;
    }
    public Integer getNumber() {
        return number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }
     // ENCAPSULAMENTOS

     // METODOS
    public void withdraw(Double amount) {
        balance -= amount + 5;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    // METODOS
 

}
