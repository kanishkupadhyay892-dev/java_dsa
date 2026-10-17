package Basic;
import java.util.Scanner;
public class Functions2 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
      System.out.println("enter the values of a and b");
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        int ans =sum(b,c);
//        System.out.println("sum="+ans);
    System.out.println("Enter your name");
        String naam=sc.next();
        System.out.println(greeting(naam));

    }
    public static String greeting(String name){
        String greet="Hello "+name;
        return greet;
    }
    public static int sum(int a, int b){
        int sum =a+b;
        return sum;
    }
}
