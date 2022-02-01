package callByValueReference;

public class CallByValueDemo {
    public static void main(String[] args) {
        Student student = new Student(1, "Sachin");
        display(student);
        System.out.println(student);
    }

    private static void display(Student student) {
        student = new Student(2,"abc");
        student.id = 300;
        student.name = "Satish";
        System.out.println(student);
    }

}
