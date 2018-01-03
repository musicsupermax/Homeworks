package lesson5B;

public class DaysSwitch {
    public static void main(String[] args) {
        String str = args.length > 0 ? args[0] : "5";
        String day;

        switch (str) {
            case "1":
                day = "Monday";
                break;
            case "2":
                day = "Tuesday";
                break;
            case "3":
                day = "Wednesday";
                break;
            case "4":
                day = "Thursday";
                break;
            case "5":
                day = "Friday";
                break;
            case "6":
            case "7":
                day = "Weekend";
                break;
            default:
                day = "Not a day of the week";
        }
        System.out.println(day);
    }
}
