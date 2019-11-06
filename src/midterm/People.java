/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

/**
 *
 * @author Student
 */
public class People {

    private String _name;
    private String _phone;

    public String getName() {
        return _name;
    }

    public String getPhone() {
        return _phone;
    }

    public People(String name, String phone) {
        _name = name;
        _phone = phone;
    }

    public String showCard() {
        return "Name: " + _name + "\n" + "Phone: " + _phone;
    }
}
