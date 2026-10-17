package Basic;

import java.util.Scanner;
public class Functions {
   public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the first number");
       int a =sc.nextInt();
       System.out.println("Enter the second number");
       int b=sc.nextInt();
       sum(a,b);

    }
    /* function structure
        access modifier return type name(arguments){
         //  body of the function
         return statement;
        }
      */
    static   public void sum(int a, int b){

       int sum=a+b;
        System.out.println("The sum of two numbers is "+sum);
    }
}
