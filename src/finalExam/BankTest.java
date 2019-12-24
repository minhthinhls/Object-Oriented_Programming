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
        Bank bank = new Bank("INTERNATIONAL UNIVERSITY BANK", "Thu Duc, Linh Trung Ward");

        System.out.println("-----ADDING ACCOUNT TEST-----\n");
        bank.addAccount(new SavingsAccount("sa01", "cus001", "Savings Account", 3000, 0.03));
        bank.addAccount(new SavingsAccount("sa02", "cus003", "Savings Account", 2000, 0.02));
        bank.addAccount(new SavingsAccount("sa03", "cus004", "Savings Account", 6000, 0.05));
        bank.addAccount(new SavingsAccount("sa04", "cus005", "Savings Account", 8000, 0.05));
        bank.addAccount(new SavingsAccount("sa05", "cus001", "Savings Account", 2000, 0.02));

        bank.addAccount(new CheckingAccount("ca01", "cus001", "Checking Account", 5000, 500));
        bank.addAccount(new CheckingAccount("ca02", "cus002", "Checking Account", 4000, 400));
        bank.addAccount(new CheckingAccount("ca03", "cus003", "Checking Account", 2000, 200));
        bank.addAccount(new CheckingAccount("ca04", "cus004", "Checking Account", 7000, 700));
        bank.addAccount(new CheckingAccount("ca05", "cus005", "Checking Account", 5000, 500));

        System.out.println("\n-----DISPLAYING ACCOUNT TEST-----\n");
        bank.displayAccByCustomerID("cus001");
        bank.displayAccByCustomerID("cus001", "Savings Account");

    }

}
