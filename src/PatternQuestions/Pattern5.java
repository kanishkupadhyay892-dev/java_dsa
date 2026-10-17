package PatternQuestions;

public class Pattern5 {
    public static void main(String[] args) {
//    *
//    **
//    ***
//    ****
//    *****
//    ****
//    ***
//    **
//    *
        pattern(6);


    }

    static void pattern(int n) {
        int m=1;
        for (int i = 1; i <= (2 * n) - 1; i++) {

            if (i > n) {

                for(int j=1;j<=n-m;j++){
                    System.out.print("*");
                }
                System.out.println();
                m++;
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }

    }
//    static void pattern(int n) {
//        for (int i = 1; i <= 2 * n - 1; i++) {
//            int stars = (i <= n) ? i : 2 * n - i;
//            for (int j = 1; j <= stars; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
}
