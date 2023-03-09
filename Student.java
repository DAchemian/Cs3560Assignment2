package application;

public class Student {
    // fields
    private String name;
    private String major;
    private double gpa;

    // constructors
    public Student(String name, String major, double gpa) {
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public Student() {
        this.name = "Unknown";
        this.major = "Undecided";
        this.gpa = 0.0;
    }

    // methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nMajor: " + major + "\nGPA: " + gpa;
    }
}


