package PatternQuestions;

public class Pattern1 {
     public static void main(String[] args) {
//   we have to print this pattern question.
//    *****
//    *****
//    *****
//    *****
//    *****
         pattern1(7);

    }
    static void pattern1(int n){
         for ( int row=1;row<=n;row++){
             // for every column print start upto m
             for(int col=1;col<=5;col++){
                 System.out.print("*");
             }
             // after printing 5 star , next line should print
             System.out.println();
         }
    }
}
