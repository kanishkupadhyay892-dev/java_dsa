package PatternQuestions;
//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
public class Pattern8 {
    public static void main(String []args){
      print(5);
    }
    static void print(int n){
       for(int row =1;row<=2*n-1;row++){
           int stars=row<=n? row:2*n-row;
           //first we print space
           for(int space=1;space<=n-stars;space++){
               System.out.print(" ");
           }
           for(int col=1;col<=stars;col++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
