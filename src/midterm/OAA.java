/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Student
 */
public class OAA {

    static List<Course> courses = new ArrayList<>();
    static Set<Integer> setID = new HashSet<>();

    static void addCourses(int ID, String name, int numCreLec, int numCreLab, String labRequirement) {
        if (setID.contains(ID)) {
            throw new IllegalArgumentException("Your ID must be unique !!!");
        }
        if (numCreLec <= 0 || numCreLab < 0) {
            throw new IllegalArgumentException("Your argument suck !!!");
        }
        if (numCreLab > 0) {
            courses.add(new Course(
                    ID, name.toUpperCase(), numCreLec, numCreLab, labRequirement
            ));
        } else {
            courses.add(new Course(
                    ID, name.toUpperCase(), numCreLec, numCreLab
            ));
        }
        setID.add(ID);
    }

    static int getNumCourses() {
        return courses.size();
    }

    static void display() {
        for (Course c : courses) {
            System.out.println(c.toString());
            if (c.getNumCreditsLab() > 0) {
                System.out.println("*HAVE LAB SESSIONS*\n");
            }
        }
    }

    public static void main(String[] args) {
        OAA.addCourses(1, "Thinh BSc", 15, 1, "Required computer");
        OAA.addCourses(2, "Tung PhD", 15, 0, "");
        display();
    }
}
