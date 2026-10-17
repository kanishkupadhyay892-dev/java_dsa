package PatternQuestions;

public class Pattern4 {
    static void main(String[] args) {
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
     pattern4(5);
    }static void pattern4(int n){
        for(int row =1;row<=n;row++){
            int m=1;
            // for every row run the column
            for(int col=1;col<=row;col++){
                System.out.print(m);
                m++;

            }
            System.out.println();
        }
    }
}
