package oops;

public class NestedClassDemo {
    public static void main(String[] args) {
        Outer.main(null);
        int a = Outer.NestedStaticClass.a;
        System.out.println(a);

        Outer.NestedStaticClass nestedStaticClass = new Outer.NestedStaticClass();
        System.out.println("Instance field from nested static class "+nestedStaticClass.number);

        //Inner class members access
        Outer outerRef = new Outer();
        Outer.Inner inner = outerRef.new Inner();
        System.out.println(outerRef.url);
        System.out.println(inner.number);

    }
}
