package oops.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Parent parent = new Parent();
//        System.out.println(parent.instanveVar);
//        parent.display();

        //2.
        Child child = new Child();
        System.out.println(child.instanveVar);
        child.display();

        //3. Child IS-A of type Parent
        Parent pc = new Child();
        System.out.println(pc.instanveVar);//100
        pc.display();// child
        //4. CTE
//        Child cp = new Parent();

    }
}
