package oops.abstraction.interfaceDemo;

public class WhatsAppServiceImpl implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending WhatsApp Text");
    }
}
