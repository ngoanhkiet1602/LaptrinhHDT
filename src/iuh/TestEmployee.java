
package iuh;

import java.time.LocalDate;


public class TestEmployee {
    public static void main(String[] args) {
        Employee eml1 = new HourlyEmployee("E01", "Ngo Anh Kiet", LocalDate.of(2002, 1, 1),100,8);
        System.out.println(eml1);
    }
}
