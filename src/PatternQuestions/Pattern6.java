package PatternQuestions;
import java.util.Scanner;
//        *
//       ***
//      *****
//     *******
//    *********
public class Pattern6 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        print(sc.nextInt());

    } static void print(int n){
        for(int row =1;row<=n;row++){
            //for printing spaces
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            // for printing stars
            for(int stars=1;stars<=2*row-1;stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
