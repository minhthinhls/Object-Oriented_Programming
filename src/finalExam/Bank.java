/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalExam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Student
 */
public class Bank {

    public static final String NAME = "INTERNATIONAL UNIVERSITY BANK";
    public static final String ADDRESS = "Thu Duc, Linh Trung Ward";
    public static List<Account> accounts = new ArrayList<>();
    public static Set<String> setID = new HashSet<>();

    static void displayAccByCustomerID(String customerID) {
        Account acc = accounts.stream()
                .filter(a -> customerID.equals(a.accountID))
                .findAny()
                .orElse(null);
        if (acc != null) {
            System.out.println(acc);
        } else {
            System.out.println("CANNOT FIND ACCOUNT !");
        }
    }

    static void displayAccByCustomerID(String customerID, String accountType) {
        Account acc = accounts.stream()
                .filter(a -> customerID.equals(a.accountID)
                        && accountType.equals(a.accountType))
                .findAny()
                .orElse(null);
        if (acc != null) {
            System.out.println(acc);
        } else {
            System.out.println("CANNOT FIND ACCOUNT !");
        }
    }

    static void addAccount(Account a) {
        if (!setID.contains(a.accountID)) {
            setID.add(a.accountID);
            accounts.add(a);
            System.out.println(String.format(
                    "ACCOUNT {ID:%s} ADDED SUCCESSFULLY !", a.accountID
            ));
        } else {
            System.out.println(String.format(
                    "ACCOUNT {ID:%s} EXISTED -> CANNOT ADD ACCOUNT !", a.accountID
            ));
        }
    }

}
