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
public class SavingsAccount extends Account {

    double interestRate;

    public SavingsAccount(String _accountID, String _accountType,
            String _customerID, double _balance, double _interestRate) {
        super(_accountID, _accountType, _customerID, _balance);
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
    public int compareTo(Account a) {
        if (a instanceof SavingsAccount) {
            SavingsAccount sa = (SavingsAccount) a;
            if (this.interestRate > sa.interestRate) {
                return 1;
            } else if (this.interestRate < sa.interestRate) {
                return -1;
            }
            return 0;
        }
        throw new ClassCastException("Cannot cast Account to SavingsAccount");
    }

}
