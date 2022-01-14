package oops;

public class Student {
    int rollNumber;
    String studentName;
    int passingYear;
    static String collegeName;

    Student(){
        System.out.println("Zero param con");
    }

    public void study(){
        System.out.println("studying is the behaviour");
    }
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        System.out.println(student.rollNumber);
        System.out.println(student.studentName);
        System.out.println(student.collegeName);
        System.out.println(student.passingYear);
        student.study();
        Student student2 = new Student();
        System.out.println("Student 2 details");
        System.out.println(student2.rollNumber);
        System.out.println(student2.studentName);
        System.out.println(student2.collegeName);
        System.out.println(student2.passingYear);
        student.study();

        //inside the main method
        int number=0;
        System.out.println(number);
    }
}
