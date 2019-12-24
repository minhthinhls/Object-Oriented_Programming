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
public abstract class Account {

    String accountID, customerID, accountType;
    double balance;

    public Account(String _accountID, String _customerID, String _accountType, double _balance) {
        accountID = _accountID;
        customerID = _customerID;
        accountType = _accountType;
        balance = _balance;
    }

    public abstract boolean withdraw(double amount);

    @Override
    public String toString() {
        return String.format("accID:%s;%s;CurrentBalance:%f",
                accountID, accountType, balance);
    }

}
