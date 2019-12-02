package lab04;

import java.util.ArrayList;
import java.util.Date;

public class Project {

    private String projectId;
    private Date startDate;
    private Date endDate;
    private ArrayList<Employee> listOfEmployee = new ArrayList<>();

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void setListOfEmployee(ArrayList<Employee> listOfEmployee) {
        this.listOfEmployee = listOfEmployee;
    }

    public Project(String projectId, Date startDate, Date endDate, ArrayList<Employee> listOfEmployee) {
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.listOfEmployee = listOfEmployee;
    }

    public int estimateBudget() {
        int budget = 0;
        for (Employee e : listOfEmployee) {
            budget += (startDate.getTime() - endDate.getTime()) / (24 * 60 * 60 * 1000) * e.getSalaryPerHour();
        }
        return budget;
    }

    @Override
    public String toString() {
        listOfEmployee.sort(null);
        String listOfEmployees = "";
        for (Employee e : listOfEmployee) {
            listOfEmployees += e.getEmployeeName() + "\n";
        }
        return listOfEmployees;
    }
}
