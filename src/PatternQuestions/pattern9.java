package PatternQuestions;
// Hollow pyramid
//             *
//            * *
//           *   *
//          *     *
//         *********
public class pattern9 {
    public static void main(String []args){
        printStar(5);
    }
    static void printStar(int n){
        for(int row=1;row<=n;row++){
            // first lets print spaces
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            // now we need to print star only at bordar
            for(int col=1;col<=2*row-1;col++){
                if(row==n){
                    System.out.print('*');
                }
                else if(col==1||col==2*row-1){
                    System.out.print("*");
                }
                else  {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
