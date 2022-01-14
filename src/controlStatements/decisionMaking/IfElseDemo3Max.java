package controlStatements.decisionMaking;

public class IfElseDemo3Max {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 100;
        int number3 = 11;

        if ((number1 > number2) && (number1 > number3)) {
            System.out.println(number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println(number2);
        } else {
            System.out.println(number3);
        }

        if(false){
            System.out.println("if block");
        } else{
            System.out.println("else block");
        }
    }
}
