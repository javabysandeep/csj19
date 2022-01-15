package oops.polymorphism.methodOverrding;

public class Test {
    public static void main(String[] args) {
        MessagingService messagingService = new WhatsappService();
        messagingService.sendMessage("Welcome to the polymorphism");
    }
}
