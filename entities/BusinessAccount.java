package entities;

public class BusinessAccount extends Account {
    
     // ATRIBUCTOS 
    private double loanLimit;
     // ATRIBUCTOS

     // CONSTRUCTORS
    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }
     // CONSTRUCTORS
    
     // ENCAPSULAMENTOS
    public void setLoanLimit(Double loan) {
        this.loanLimit = loan;
    }
    public Double getLoanLimit() {
        return loanLimit;
    }
     // ENCAPSULAMENTOS

     // METODOS 
    public void loan(Double amount) {
        if (amount <= loanLimit) {
            balance += amount - 10;
        }
    } 
    
}
