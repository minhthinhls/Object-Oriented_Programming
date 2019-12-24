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
import java.util.stream.Collectors;

/**
 *
 * @author Student
 */
public class Bank {

    public static final String NAME = "INTERNATIONAL UNIVERSITY BANK";
    public static final String ADDRESS = "Thu Duc, Linh Trung Ward";
    public static List<Account> listOfAccount = new ArrayList<>();
    public static Set<String> setID = new HashSet<>();

    static void displayAccByCustomerID(String customerID) {
        System.out.println(String.format("Customer ID: %s", customerID));
        List<Account> accounts = listOfAccount.stream()
                .filter(a -> customerID.equals(a.customerID))
                .collect(Collectors.toList());
        if (!accounts.isEmpty()) {
            for (Account a : accounts) {
                System.out.println(a);
            }
        } else {
            System.out.println("CANNOT FIND ACCOUNTS !");
        }
    }

    static void displayAccByCustomerID(String customerID, String accountType) {
        System.out.println(String.format(
                "Customer ID: %s\tAccount Type: %s", customerID, accountType
        ));
        List<Account> accounts = listOfAccount.stream()
                .filter(a -> customerID.equals(a.customerID)
                        && accountType.equals(a.accountType))
                .collect(Collectors.toList());
        if (!accounts.isEmpty()) {
            for (Account a : accounts) {
                System.out.println(a);
            }
        } else {
            System.out.println("CANNOT FIND ACCOUNTS !");
        }
    }

    static void addAccount(Account a) {
        if (!setID.contains(a.accountID)) {
            setID.add(a.accountID);
            listOfAccount.add(a);
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
