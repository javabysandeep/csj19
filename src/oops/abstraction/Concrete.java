package oops.abstraction;

public class Concrete {
    void display(){
        System.out.println("Concrete method");
    }

//    abstract void send(String message);
public static void main(String[] args) {
//    UserService userService = new UserService();
    UserService userService = new UserServiceImpl();


}
}
