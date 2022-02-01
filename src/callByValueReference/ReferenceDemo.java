package callByValueReference;

public class ReferenceDemo {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        m1();
        int num1 = 100;
        int num2 = 200;
        System.out.println(add(num1, num2));//3000
        System.out.println(num1+num2);//300
        Student student = new Student(1, "Sachin");
        display(student);
        System.out.println(student);
    }

    private static void display(Student student) {
        student.id = 300;
        student.name ="Satish";
        System.out.println(student);
    }

    private static int add(int num1, int num2) {
        num1 = 1000;
        num2 = 2000;
        return num1 + num2;
    }

    private static void m1() {
        int a = 20;
        System.out.println(a);
        m2();
    }

    private static void m2() {
        int a = 30;
        System.out.println(a);
        m3();
    }

    private static void m3() {
        int a = 40;
        System.out.println(a);
    }
}
