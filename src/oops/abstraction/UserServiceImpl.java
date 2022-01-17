package oops.abstraction;

public class UserServiceImpl extends UserService{
    @Override
    void notifyUser() {
        System.out.println("implementation provided inside the child class");
    }
}
