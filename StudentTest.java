package application;

public class StudentTest {
    public static void main(String[] args) {
        Student john = new Student("John", "CS", 3.5);
        Student maryAnn = new Student();

        john.setName("Johnny");
        john.setMajor("Computer Science");
        john.setGpa(3.8);

        maryAnn.setName("Mary Ann");
        maryAnn.setMajor("CE");
        maryAnn.setGpa(3.3);

        System.out.println("John's info:\n" + john.toString());
        System.out.println("Mary Ann's info:\n" + maryAnn.toString());
    }
}


