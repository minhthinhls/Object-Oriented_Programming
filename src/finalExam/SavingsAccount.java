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
public class SavingsAccount extends Account implements Comparable<SavingsAccount> {

    double interestRate;

    public SavingsAccount(String _accountID, String _customerID, String _accountType,
            double _balance, double _interestRate) {
        super(_accountID, _customerID, _accountType, _balance);
        interestRate = _interestRate;
    }

    @Override
    public boolean withdraw(double amount) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return String.format("accID:%s;%s;CurrentBalance:%f;Interest Rate:%f",
                accountID, accountType, balance, interestRate);
    }

    @Override
    public int compareTo(SavingsAccount sa) {
        if (this.interestRate > sa.interestRate) {
            return -1; // This object is ranked higher
        } else if (this.interestRate < sa.interestRate) {
            return 1;
        }
        return 0;
    }

}
