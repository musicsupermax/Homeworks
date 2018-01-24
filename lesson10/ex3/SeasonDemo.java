package lesson10.ex3;

public class SeasonDemo {
    public static void main(String[] args) {
        Season season = Season.FALL;
        System.out.println(season);
        printSeason(season);
        printAllSeasons();
    }

    public static void printSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("My favorite season is Winter! Average temperature is "
                        + season.getAverageTemp());
                break;
            case SPRING:
                System.out.println("My favorite season is Spring! Average temperature is "
                        + season.getAverageTemp());
                break;
            case SUMMER:
                System.out.println("My favorite season is Summer! Average temperature is "
                        + season.getAverageTemp());
                break;
            case FALL:
                System.out.println("My favorite season is Fall! Average temperature is "
                        + season.getAverageTemp());
                break;
            default:
                System.out.println("Invalid input!");
        }
    }

    public static void printAllSeasons() {
        Season[] seasons = Season.values();

        for (Season season : seasons) {
            System.out.println(season + " " + season.ordinal()
                    + " " + season.getAverageTemp() + " " + season.getDescription());
        }
    }
}
