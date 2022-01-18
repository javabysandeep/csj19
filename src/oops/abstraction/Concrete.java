package oops.abstraction;

public class Concrete {


public static void main(String[] args) {
    UserService userService = new UserServiceImpl();
    userService.A();
    userService.B();
//    userService.C(""); //CTE as it is not present in parent class

    EmailService emailService = new UserServiceImpl();
    emailService.A();
    emailService.B();
    emailService.C("");


}
}
