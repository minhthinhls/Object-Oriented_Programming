package lab04;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ProjectPrinter implements Runnable {

    private Project p;

    public ProjectPrinter(Project p) {
        this.p = p;
    }

    @Override
    public void run() {
        ArrayList<Employee> employees = p.getListOfEmployee();
        SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
        for (Employee e : employees) {
            System.out.println(String.format(
                    "[Project ID: %s - Project Duration: %s to %s][Name: %s - Salary Per Hour: %s]",
                    p.getProjectId(),
                    simpleDate.format(p.getStartDate()),
                    simpleDate.format(p.getEndDate()),
                    e.getEmployeeName(),
                    e.getSalaryPerHour()
            ));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
        System.out.println();
    }
}
