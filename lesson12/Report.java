package lesson12;

public class Report {
    public static void main(String[] args) {
        Employee builder = new Employee("Budy Dudo", 5000.50);
        Employee policeman = new Employee("Tim Burt", 4300.70);
        Employee[] employees = {builder, policeman};

        generateReport(employees);
    }

    public static void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.printf("%S получает %2$.2f и премию %2$.2f%n",
                    employee.getFullName(), employee.getSalary());
        }
    }
}
