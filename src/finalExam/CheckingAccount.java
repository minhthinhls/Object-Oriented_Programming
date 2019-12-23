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
public class CheckingAccount extends Account {

    double overdraftAmount;

    public CheckingAccount(String _accountID, String _accountType, String _customerID,
            double _balance, double _overdraftAmount) {
        super(_accountID, _accountType, _customerID, _balance);
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
    public int compareTo(Account a) {
        if (a instanceof CheckingAccount) {
            CheckingAccount ca = (CheckingAccount) a;
            if (this.overdraftAmount > ca.overdraftAmount) {
                return 1;
            } else if (this.overdraftAmount < ca.overdraftAmount) {
                return -1;
            }
            return 0;
        }
        throw new ClassCastException("Cannot cast Account to CheckingAccount");
    }

}
