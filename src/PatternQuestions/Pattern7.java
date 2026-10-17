package PatternQuestions;
//        *********
//         *******
//          *****
//           ***
//            *
public class Pattern7 {
    public static void main(String [] args){
      print(5);
    }
    static void print(int n){
        int m=n;
       for(int row =1;row<=n;row++){
           //for printing spaces
           for(int spaces=0;spaces<row;spaces++){
               System.out.print(" ");
           }
           for(int stars=1;stars<=2*m-1;stars++){
               System.out.print("*");
           }
           m--;
           System.out.println();
       }
    }
}
