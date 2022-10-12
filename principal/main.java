package principal;

import java.nio.channels.AcceptPendingException;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;


public class main {

    public static void main(String[] args) {
        
        Account acc = new Account(1001, "Alex", 1000.0);
        BusinessAccount bacc = new BusinessAccount(1030, "Alice", 230.0, 500.0);

        // UPCASTING
        Account acc1 = bacc; // Super class pode receber um Sub class 
        Account acc2 = new BusinessAccount(1004, "bob", 1000.0, 300.0);
        Account acc3 = new SavingsAccount(1203, "Luan", 1000.0, 0.01);

        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount)acc2; // Isso pode pois a variavel acc2 mesmo  send uma Super class foi iniciada com a mesma Sub class
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount)acc3; Não pode, por quer a variavel acc3 é uma Super classe que foi iniciada com outra Sub class
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan");
        }
        if (acc instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Sucesso!");
        }
        
        // Testando a SOBREPOSIÇÃO
        acc.withdraw(200.0);
        System.out.println("Criado com classe principal: " + acc.getBalance());

        acc2.withdraw(200.0);
        System.out.println("Com SUPER(): " + acc2.getBalance()); //Metodo loan faz um desconto de -10 reais

        acc3.withdraw(200.0);
        System.out.println("Sobreposição sem super: " + acc3.getBalance());

        

    }

}