package oops.polymorphism.methodOverrding;

public class WhatsappService extends MessagingService{
    @Override
     public void sendMessage(String message){
        System.out.println("Sending via WhatsApp..."+message);
    }

    //CTE
   /* public  void eligible(){
        System.out.println("final method");
    }*/
}
