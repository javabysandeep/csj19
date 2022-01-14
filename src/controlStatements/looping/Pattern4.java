package controlStatements.looping;
//     *
//    **
//   ***
//  ****
// *****
public class Pattern4 {
    public static void main(String[] args) {
        int range = 5;
        for (int row = 1; row <=range ; row++) {
            for(int space = range-row; space>0 ;space-- ){
                System.out.print(" ");
            }
            for (int column = 1; column <=row ; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
