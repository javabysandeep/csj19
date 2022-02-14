package exceptionHandling;

import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println(1);
        System.out.println(2);
//        System.out.println(3/0);
        System.out.println(4);
        System.out.println(5);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number");
        int num = scanner.nextInt();
        ExceptionDemo1 e1 = new ExceptionDemo1();
//        ExceptionDemo1 clone = (ExceptionDemo1) e1.clone();
        String str= null;
//        System.out.println(str.length());
        Integer i = Integer.valueOf("abcs");
        System.out.println(i);
    }
}













