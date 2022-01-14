package operators;

public class BitwiseOperators {
    // &, |, ^, ~, <<, >>, >>>
    public static void main(String[] args) {
        System.out.println(4 & 5);//4
        System.out.println(4 | 5);//5
        System.out.println(4 ^ 5);//1
        System.out.println(~4);//-5
        System.out.println(~5);//-6
        System.out.println(~6);//-7
        System.out.println(~-6);//5 --> do plus one change the sign
        System.out.println(4 << 1);//8
        System.out.println(5 << 1); //10
        System.out.println(6 << 1); // 12
        System.out.println(7 << 1); // 14
        System.out.println(4 << 1); // 8
        System.out.println(4 << 2); // 16
        System.out.println(4 << 3); // 32
        System.out.println(4 << 4); // 64

         System.out.println(5 << 1); // 10
        System.out.println(5 << 2); // 20
        System.out.println(5 << 3); // 40
        System.out.println(5 << 4); // 80
        // number * 2^no.of bits

        //right shift bitwise operator: number/(2^no. of bits)
        System.out.println(-4 >> 1); //2
        System.out.println(4 >> 2); //1
        System.out.println(4 >> 3); //0
        System.out.println(4 >> 4); //0

        // unsigned right shift bitwise operator
        System.out.println("unsigned right shift" + (4 >>> 1)); //2
        System.out.println("unsigned right shift" + (4 >>> 2)); //1
        System.out.println("unsigned right shift" + (4 >>> 3)); //0
        System.out.println("unsigned right shift" + (4 >>> 4)); //0
        System.out.println("unsigned right shift" + (-4 >>> 1)); //0



    }
}
