package oops.abstraction;

public class UserServiceImpl extends EmailService{

    @Override
    public void C(String message) {
        System.out.println("C");
    }

    @Override
    void A() {
        System.out.println("A");
    }
}
