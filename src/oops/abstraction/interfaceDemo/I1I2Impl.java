package oops.abstraction.interfaceDemo;

public class I1I2Impl implements I1,I2{
    @Override
    public void print() {
        System.out.println("method implemented");
    }

    @Override
    public void sendOtp() {
        I2.super.sendOtp();
    }
}
