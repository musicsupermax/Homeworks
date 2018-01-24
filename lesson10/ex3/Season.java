package lesson10.ex3;

public enum Season {
    WINTER(-10), SPRING(12), SUMMER(20) {
        @Override
        public String getDescription() {
            return "Warm season!";
        }
    }, FALL(10);
    double averageTemp;

    Season(double averageTemp) {
        this.averageTemp = averageTemp;
    }

    public double getAverageTemp() {
        return averageTemp;
    }

    public String getDescription() {
        return "Cold season!";
    }
}
