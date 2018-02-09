package lesson12;

import java.util.Date;

public class Employee {
    private String fullName;
    private double salary;
    private Date salaryDate;

    public Employee(String fullName, double salary, Date salaryDate) {
        this.fullName = fullName;
        this.salary = salary;
        this.salaryDate = salaryDate;
    }

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return Double.compare(employee.salary, salary) == 0 &&
                (fullName != null ? fullName.equals(employee.fullName)
                        : employee.fullName == null) &&
                (salaryDate != null ? salaryDate.equals(employee.salaryDate)
                        : employee.salaryDate == null);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = fullName != null ? fullName.hashCode() : 0;
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (salaryDate != null ? salaryDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", salaryDate=" + salaryDate +
                '}';
    }
}
