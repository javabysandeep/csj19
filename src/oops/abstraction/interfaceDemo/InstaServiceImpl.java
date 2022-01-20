package oops.abstraction.interfaceDemo;

public class InstaServiceImpl implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Insta direct Text");
    }

   /* @Override
    public void generateOtp() {
        System.out.println("Custom logic");
    }*/
}
