package cs3560;

import application.Student;

public class Transcript {
    private Student student;
    private String courseName;
    private String grade;
    
    public Transcript(Student student, String courseName, String grade) {
        this.student = student;
        this.courseName = courseName;
        this.grade = grade;
    }
}
