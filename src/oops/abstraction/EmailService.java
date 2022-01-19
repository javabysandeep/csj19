package oops.abstraction;

public abstract class EmailService extends UserService {

   public abstract  void C(String message);
//   static abstract void add();//CTE

    @Override
    void B() {
        System.out.println("B overridden");
    }
}
