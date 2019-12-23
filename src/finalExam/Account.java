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
public abstract class Account implements Comparable<Account> {

    String accountID, accountType, customerID;
    double balance;

    public Account(String _accountID, String _accountType, String _customerID, double _balance) {
        accountID = _accountID;
        accountType = _accountType;
        customerID = _customerID;
        balance = _balance;
    }

    public abstract boolean withdraw(double amount);

    @Override
    public abstract String toString();

    @Override
    public abstract int compareTo(Account a);

}
