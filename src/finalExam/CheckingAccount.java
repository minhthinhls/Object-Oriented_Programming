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
public class CheckingAccount extends Account implements Comparable<CheckingAccount> {

    double overdraftAmount;

    public CheckingAccount(String _accountID, String _customerID, String _accountType,
            double _balance, double _overdraftAmount) {
        super(_accountID, _customerID, _accountType, _balance);
        overdraftAmount = _overdraftAmount;
    }

    @Override
    public boolean withdraw(double amount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return String.format("accID:%s;%s;CurrentBalance:%f;Overdraft Amount:%f",
                accountID, accountType, balance, overdraftAmount);
    }

    @Override
    public int compareTo(CheckingAccount ca) {
        if (this.overdraftAmount > ca.overdraftAmount) {
            return -1; // This object is ranked higher
        } else if (this.overdraftAmount < ca.overdraftAmount) {
            return 1;
        }
        return 0;
    }

}
