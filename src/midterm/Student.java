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
public class Student {

    private People _base;
    private String _major;

    public Student(String name, String phone, String major) {
        _base = new People(name, phone);
        _major = major;
    }

    public String showCard() {
        return _base.showCard() + "\n" + "Major: " + _major;
    }
}
