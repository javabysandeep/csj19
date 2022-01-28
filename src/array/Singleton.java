package array;

public class Singleton {
    public static void main(String[] args) {
        Student student1 = Student.getStudentInstance();
        Student student2 = Student.getStudentInstance();
        System.out.println(student1);
        System.out.println(student2);
    }
}

class Student {

    private static Student student = new Student();

    private Student() {
    }


    public static Student getStudentInstance() {
        return student;
    }
}
// how to break singleton
//1. cloning
//2. reflection
//3. serialization
//4. multiple threads