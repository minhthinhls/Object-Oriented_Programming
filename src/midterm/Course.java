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
public class Course {

    private final int ID;
    private final String name;
    private final int numCreditsLec;
    private final int numCreditsLab;
    private String labRequirement = "No requirement for lab section";

    public Course(int ID, String name, int numCreditsLec, int numCreditsLab) {
        this.ID = ID;
        this.name = name;
        this.numCreditsLec = numCreditsLec;
        this.numCreditsLab = numCreditsLab;
    }

    public Course(int ID, String name, int numCreditsLec, int numCreditsLab, String labRequirement) {
        this.ID = ID;
        this.name = name;
        this.numCreditsLec = numCreditsLec;
        this.numCreditsLab = numCreditsLab;
        this.labRequirement = labRequirement;
    }

    @Override
    public String toString() {
        return String.format(
                "ID: %d\nName:%s\nCreLec:%d\nCreLab:%d\nRequirement:%s",
                ID, name, numCreditsLec, numCreditsLab, labRequirement
        );
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getNumCreditsLec() {
        return numCreditsLec;
    }

    public int getNumCreditsLab() {
        return numCreditsLab;
    }

    public String getLabRequirement() {
        return labRequirement;
    }

}
