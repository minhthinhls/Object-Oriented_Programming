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
 * Receiver.
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

/**
 * Command.
 */
/*public*/ interface IClick {

    void click();
}

/**
 * Abstract Command.
 */
/*public*/ abstract class OnMenuItem implements IClick {

    protected List<User> users;

    public OnMenuItem(List _users) {
        users = _users;
    }
}

/**
 * Concrete Command.
 */
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

/**
 * Concrete Command.
 */
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

/**
 * INVOKER.
 */
/*public*/ class Menu {

    private IClick menuItem;

    public Menu() {

    }

    public void setMenuItem(IClick _menuItem) {
        menuItem = _menuItem;
    }

    public void click() {
        menuItem.click();
    }
}

/**
 * CLIENT.
 */
public class GUI {

    private List<User> users;
    private Menu menu = new Menu();

    public GUI() {
        users = new ArrayList<User>();
    }

    public void onMenuItem1_Click() {
        menu.setMenuItem(new OnMenuItem1(users));
        menu.click();
    }

    public void onMenuItem2_Click() {
        menu.setMenuItem(new OnMenuItem2(users));
        menu.click();
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
