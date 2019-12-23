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
        Bank.addAccount(new CheckingAccount("1", "CheckingAccount", "TEST", 2000, 100));
        Bank.addAccount(new CheckingAccount("2", "CheckingAccount", "TEST", 3000, 300));
        Bank.addAccount(new CheckingAccount("3", "CheckingAccount", "TEST", 1500, 200));
        Bank.addAccount(new CheckingAccount("3", "CheckingAccount", "TEST", 1500, 200));

        Bank.addAccount(new SavingsAccount("4", "SavingsAccount", "TEST", 2000, 100));
        Bank.addAccount(new SavingsAccount("5", "SavingsAccount", "TEST", 3000, 300));
        Bank.addAccount(new SavingsAccount("6", "SavingsAccount", "TEST", 1500, 200));
        Bank.addAccount(new SavingsAccount("6", "SavingsAccount", "TEST", 1500, 200));

        System.out.println("\n-----DISPLAYING ACCOUNT TEST-----\n");
        Bank.displayAccByCustomerID("1");
        Bank.displayAccByCustomerID("7");
        Bank.displayAccByCustomerID("2", "CheckingAccount");
        Bank.displayAccByCustomerID("2", "SavingsAccount");

    }

}
