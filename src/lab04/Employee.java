package lab04;

public class Employee implements Comparable<Employee> {

    private String employeeId;
    private String employeeName;
    private int salaryPerHour;
    private int noOfLeavingDay;
    private int noOfTravelDay;

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public int getNoOfLeavingDay() {
        return noOfLeavingDay;
    }

    public void setNoOfLeavingDay(int noOfLeavingDay) {
        this.noOfLeavingDay = noOfLeavingDay;
    }

    public int getNoOfTravelDay() {
        return noOfTravelDay;
    }

    public void setNoOfTravelDay(int noOfTravelDay) {
        this.noOfTravelDay = noOfTravelDay;
    }

    public Employee(String employeeId, String employeeName, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }

    public int calculateWeeklySalary() {
        return salaryPerHour * 8 * (5 - noOfLeavingDay + noOfTravelDay / 2);
    }

    @Override
    public int compareTo(Employee e) {
        if (this.noOfTravelDay > e.noOfTravelDay) {
            return 1;
        }
        if (this.noOfTravelDay < e.noOfTravelDay) {
            return 0;
        }
        if (this.noOfLeavingDay > e.noOfLeavingDay) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return String.format("[Name: %s - Salary Per Hour: %d - Weekly Salary: %d]",
                employeeName, salaryPerHour, calculateWeeklySalary()
        );
    }

}
