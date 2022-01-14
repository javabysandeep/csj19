package controlStatements.looping;
//     *
//    **
//   ***
//  ****
// *****
public class Pattern7Triangle {
    public static void main(String[] args) {
        int range = 50;
        for (int row = 1; row <=range ; row++) {
            for(int space = range-row; space>0 ;space-- ){
                System.out.print(" ");
            }
            for (int column = row; column >0 ; column--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
