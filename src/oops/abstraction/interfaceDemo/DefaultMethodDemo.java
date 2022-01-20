package oops.abstraction.interfaceDemo;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MessageService messageService = new InstaServiceImpl();
        messageService.generateOtp();

        I1 i1 = new I1I2Impl();
        i1.sendOtp();
    }
}
