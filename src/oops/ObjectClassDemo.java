package oops;

public class ObjectClassDemo extends Object {
    public static void main(String[] args) throws Throwable {
        ObjectClassDemo demo = new ObjectClassDemo();
        ObjectClassDemo demo2 = new ObjectClassDemo();
        System.out.println(demo.getClass());
        System.out.println(demo.toString());
        System.out.println(demo);
        System.out.println(Integer.toHexString(1265094477));
        System.out.println(demo.hashCode());
        System.out.println(demo.equals(demo2));
        demo= demo2;
        //explicitly call the garbage collector
        System.gc();
        System.out.println(demo.equals(demo2));
        System.out.println(demo.hashCode()+" "+demo2.hashCode());
    }

    @Override
    public String toString() {
        return "some value";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize method");
    }
}
