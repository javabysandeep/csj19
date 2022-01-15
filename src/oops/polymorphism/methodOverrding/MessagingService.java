package oops.polymorphism.methodOverrding;

public class MessagingService {
     public void sendMessage(String message){
        System.out.println("Sending via email..."+message);
    }

    public final void eligible(){
        System.out.println("final method");
    }
}
