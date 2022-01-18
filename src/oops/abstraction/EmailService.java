package oops.abstraction;

public abstract class EmailService extends UserService {

   public abstract void C(String message);

    @Override
    void B() {
        System.out.println("B overridden");
    }
}
