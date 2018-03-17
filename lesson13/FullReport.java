package lesson13;

import lesson12.Employee;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport {
    public static void main(String[] args) throws UnsupportedEncodingException {

        Employee builder = new Employee("Budy Dudo", 5000.50,
                new GregorianCalendar(2018, 2, 30).getTime());
        Employee policeman = new Employee("Tim Burt", 4300.70,
                new GregorianCalendar(2018, 2, 29).getTime());
        Employee[] employees = {builder, policeman};

        Locale us = new Locale("en", "US");
        generateReport(employees, us);

        Locale current = Locale.getDefault();
        generateReport(employees, current);

        Locale ua = new Locale("uk", "UA");
        generateReport(employees, ua);
    }

    public static void generateReport(Employee[] employees, Locale current)
            throws UnsupportedEncodingException {
        ResourceBundle rb = ResourceBundle.getBundle("report", current);
        String s1 = rb.getString("heading");
        s1 = new String(s1.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println(s1);

        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        NumberFormat nm = NumberFormat.getCurrencyInstance(current);
        for (Employee employee : employees) {
            System.out.printf("%S получает %s в дату %s%n",
                    employee.getFullName(), nm.format(employee.getSalary()),
                    df.format(employee.getSalaryDate()));
        }
    }
}
