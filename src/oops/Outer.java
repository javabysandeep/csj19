package oops;

public class Outer {
    String url = "outer url";
    //Nested class-> non-static nested class-> inner class
    class Inner {
//        static int a = 20;
        int number = 190;
    }
    //Nested class-> static nested class
    static class NestedStaticClass {
        static int a = 20;
        int number = 100;
    }

    public static void main(String[] args) {
        //Local Inner class
         class LocalInnerClass {
            int localInnerVar = 30;
            void display(){
                System.out.println("instance method of local inner class");
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
         localInnerClass.display();
        System.out.println(localInnerClass.localInnerVar);
    }
}
