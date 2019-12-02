package lab04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class AppTest {

    public static void main(String[] args) {
        int _2019 = 2019 - 1900;
        Employee khanh = new Employee("1", "Khanh", 15, 1, 2);
        Employee oanh = new Employee("2", "Oanh", 16, 4, 3);
        Employee linh = new Employee("3", "Linh", 17, 2, 4);
        Employee huy = new Employee("4", "Huy", 13, 4, 8);

        ArrayList<Employee> employee1 = new ArrayList<>(Arrays.asList(khanh, oanh, linh));
        ArrayList<Employee> employee2 = new ArrayList<>(Arrays.asList(oanh, linh, huy));

        Project project1 = new Project("1",
                new Date(_2019, Calendar.JANUARY, 1),
                new Date(_2019, Calendar.FEBRUARY, 28),
                employee1);

        Project project2 = new Project("2",
                new Date(_2019, Calendar.NOVEMBER, 1),
                new Date(_2019, Calendar.DECEMBER, 31),
                employee2);

        new ProjectPrinter(project1).run();
        new ProjectPrinter(project2).run();
    }
}
