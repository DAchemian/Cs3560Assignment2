package cs3560;

public class Employee {
    private String name;
    private int hours;
    private double calculateSalary;
    
    public Employee(String name, int hours, double calculateSalary) {
        this.name = name;
        this.hours = hours;
        this.calculateSalary = hours * 20;
    }
}
