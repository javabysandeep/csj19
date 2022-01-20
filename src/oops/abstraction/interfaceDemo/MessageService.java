package oops.abstraction.interfaceDemo;

public interface MessageService {
    void sendMessage(String message);

      default void generateOtp() {
         System.out.println("Default method");
     }
}
