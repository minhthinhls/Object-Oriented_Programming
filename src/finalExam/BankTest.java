/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalExam;

/**
 *
 * @author Student
 */
public class BankTest {

    public static void main(String args[]) {
        System.out.println("-----ADDING ACCOUNT TEST-----\n");
        Bank.addAccount(new CheckingAccount("1", "C1", "CheckingAccount", 2000, 100));
        Bank.addAccount(new CheckingAccount("2", "C1", "CheckingAccount", 3000, 300));
        Bank.addAccount(new CheckingAccount("3", "C2", "CheckingAccount", 1500, 200));
        Bank.addAccount(new CheckingAccount("3", "C2", "CheckingAccount", 1500, 200));

        Bank.addAccount(new SavingsAccount("4", "C1", "SavingsAccount", 2000, 100));
        Bank.addAccount(new SavingsAccount("5", "C1", "SavingsAccount", 3000, 300));
        Bank.addAccount(new SavingsAccount("6", "C2", "SavingsAccount", 1500, 200));
        Bank.addAccount(new SavingsAccount("6", "C2", "SavingsAccount", 1500, 200));

        System.out.println("\n-----DISPLAYING ACCOUNT TEST-----\n");
        Bank.displayAccByCustomerID("C1");
        Bank.displayAccByCustomerID("C3");
        Bank.displayAccByCustomerID("C1", "CheckingAccount");
        Bank.displayAccByCustomerID("C2", "SavingsAccount");

    }

}
