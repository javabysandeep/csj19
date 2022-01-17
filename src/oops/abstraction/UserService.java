package oops.abstraction;

public abstract class UserService {
    int instanceVar = 100;
    static int staticVar = 200;

    void instanceMethod(){
        System.out.println("instance method");
    }
   static void staticMethod(){
        System.out.println("static method");
    }

    UserService(){
        System.out.println("con");
    }
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }
    class NestedClass{

    }
    static class StaticNestedClass{

    }
    abstract void notifyUser();
}
