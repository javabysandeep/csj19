package oops.abstraction.interfaceDemo;

public class EmailServiceImpl implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email");
    }
}
