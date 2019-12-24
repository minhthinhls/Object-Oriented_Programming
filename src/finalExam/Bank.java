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

    private final String name;
    private final String address;
    private List<Account> listOfAccount;
    private Set<String> setID;

    public Bank(String _name, String _address) {
        name = _name;
        address = _address;
        listOfAccount = new ArrayList<>();
        setID = new HashSet<>();
    }

    public void displayAccByCustomerID(String customerID) {
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

    public void displayAccByCustomerID(String customerID, String accountType) {
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

    public void addAccount(Account a) {
        if (!setID.contains(a.accountID)) {
            setID.add(a.accountID);
            listOfAccount.add(a);
            System.out.println(String.format(
                    "<<cusID: %s>> <<accType: %s>> <<accID: %s>> was added successfully !",
                    a.customerID, a.accountType, a.accountID
            ));
        } else {
            System.out.println(String.format(
                    "Couldn't add account <<ID: %s>> !", a.accountID
            ));
        }
    }

    @Override
    public String toString() {
        return String.format("NAME: %s\tADDRESS: %s", name, address);
    }

}
