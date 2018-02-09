package lesson13;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Birthday {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(1989, 9, 1);
        System.out.println(calendar.getTime());
        System.out.println("День недели: " + Calendar.DAY_OF_WEEK);
        System.out.println("Неделя в году: " + Calendar.WEEK_OF_YEAR);
        System.out.println("Количество прожитых милисекунд: " + calendar.getTimeInMillis());

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(df1.format(calendar.getTime()));
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println(df2.format(calendar.getTime()));
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println(df3.format(calendar.getTime()));
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df4.format(calendar.getTime()));
    }
}
