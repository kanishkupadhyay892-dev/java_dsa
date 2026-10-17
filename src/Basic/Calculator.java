package Basic;

import java.util.Scanner;
//we have to make a calculator and ensure the program will end when input is x or X.
public class Calculator {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);

        while(true) {
            System.out.println("PLEASE INPUT TWO INTEGER NUMBERS");
            int a =sc.nextInt();
            int b =sc.nextInt();
            System.out.println("choose any of these  +,-,*,/,% and also you can press x or X for exit");
            char op=sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
               if(op=='+'){
                   System.out.println("Sum"+(a+b));

               }
                else if(op=='-'){
                    System.out.println("Difference" +(a-b));

                }
               else if(op=='*'){
                   System.out.println("Product" +(a*b));

               }
               else if(op=='/'&& b!=0){

                   System.out.println("Divide" +(a/b));

               }
               else {
                   System.out.println("Remainder" +(a%b));

               }

            }
            if(op=='x'||op=='X'){
                break;
            }

        }
    }
}
