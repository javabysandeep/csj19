package operators.logicalOperators;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {

        // &, &&-->AND, |,|| -->OR , ^ XOR,

        // All logical operators are applicable for boolean
        System.out.println(true & false);//false
        System.out.println(true && false);//false
        System.out.println(true | false);//true
        System.out.println(true || false);//true
        System.out.println(true ^ false);//true

        System.out.println(4 & 5);//4
        //        System.out.println(4 && 5);//CTE: it is applicable for boolean
        System.out.println(4 | 5);//5
        //        System.out.println(4 || 5);//CTE: it is applicable for boolean
        System.out.println(4 ^ 5);//1

        // short circuit operators : &&, ||

        System.out.println((4 > 10) && (4 > 3) && (4 > 2));
        System.out.println((4 > 10) & (4 > 3) & (4 > 2));

        System.out.println(!true);//false
        System.out.println(!false); //true

//        System.out.println(!4);//CTE


    }
}
