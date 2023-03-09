package cs3560;

public class Book extends Course {
    private String name;
    private String author;

    public Book(String name, String author) {
        this("", "", "");
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, String courseCode) {
        super(courseCode, courseCode, 0);
        this.name = name;
        this.author = author;
    }

}

