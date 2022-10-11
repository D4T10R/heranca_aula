package entities;

public class SavingsAccount extends Account{
    
    // ATRIBUCTOS 
    private Double interestRate;
    // ATRIBUCTOS

    // CONSTRUCTORS
    public SavingsAccount() {
        super();
    }
    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }
    // CONSTRUCTORS

    // ENCAPSULAMENTO
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    public Double getInterestRate() {
        return interestRate;
    }
    // ENCAPSULAMENTO

    // METODOS
    public void updateBalance() {
        balance += balance * interestRate;
    }


}
