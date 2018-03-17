package lesson13;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Holidays {
    public static void main(String[] args) {
        GregorianCalendar[] holiday = new GregorianCalendar[5];
        holiday[0] = new GregorianCalendar(2018, 0, 1);
        holiday[1] = new GregorianCalendar(2018, 1, 7);
        holiday[2] = new GregorianCalendar(2018, 3, 8);
        holiday[3] = new GregorianCalendar(2018, 4, 8);
        holiday[4] = new GregorianCalendar(2018, 5, 1);

        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
        SimpleDateFormat format1 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("dd_MM_yy");
        SimpleDateFormat format3 = new SimpleDateFormat("День dd Месяц MM Год yyyy");

        System.out.println("New year: " + format.format(holiday[0].getTime()));
        System.out.println("Christmas: " + format1.format(holiday[1].getTime()));
        System.out.println("Women's day: " + format2.format(holiday[2].getTime()));
        System.out.println("Easter: " + format3.format(holiday[3].getTime()));
        System.out.println("Labor day: " + format1.format(holiday[4].getTime()));
    }
}
