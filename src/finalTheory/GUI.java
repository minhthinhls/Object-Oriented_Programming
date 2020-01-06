/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalTheory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Student
 */

/*public*/ class User {

    public User() {
        /*...DO SOMETHING HERE...*/
    }

    public void sendEmail(String message) {
        /*...DO SOMETHING HERE...*/
        System.out.println(message);
    }

    public void showInfo() {
        /*...DO SOMETHING HERE...*/
        System.out.println("Show User Info");
    }
}

/*public*/ interface IClick {

    void click();
}

/*public*/ abstract class OnMenuItem implements IClick {

    protected List<User> users;

    public OnMenuItem(List _users) {
        users = _users;
    }
}

/*public*/ class OnMenuItem1 extends OnMenuItem {

    public OnMenuItem1(List _users) {
        super(_users);
    }

    @Override
    public void click() {
        for (User user : this.users) {
            user.sendEmail("Happy New Year");
        }
    }
}

/*public*/ class OnMenuItem2 extends OnMenuItem {

    public OnMenuItem2(List _users) {
        super(_users);
    }

    @Override
    public void click() {
        for (User user : this.users) {
            user.showInfo();
        }
    }
}

public class GUI {

    private List<User> users;
    private IClick onMenuItem;

    public GUI() {
        users = new ArrayList<User>();
    }

    public void onMenuItem1_Click() {
        onMenuItem = new OnMenuItem1(users);
        onMenuItem.click();
    }

    public void onMenuItem2_Click() {
        onMenuItem = new OnMenuItem2(users);
        onMenuItem.click();
    }

    public static void main(String args[]) {
        GUI gui = new GUI();
        gui.users = Arrays.asList(new User[]{
            new User(), new User(), new User()
        });
        gui.onMenuItem1_Click();
        gui.onMenuItem2_Click();
    }

}
