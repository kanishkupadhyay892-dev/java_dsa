package PatternQuestions;

public class Pattern3 {
    public static void main(String []args){
//    *****
//    ****
//    ***
//    **
//    *
        pattern3(5);
     }  static void pattern3(int n){
        int m=n;
        for(int row=1;row<=n;row++){
            for(int col=m;col>=1;col--){
                System.out.print("*");
            }
            m--;
            System.out.println();
        }
    }
}
