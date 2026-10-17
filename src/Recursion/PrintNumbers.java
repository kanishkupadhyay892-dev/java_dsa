package Recursion;

public class PrintNumbers {
    public static void main(String []args){
        // we have to print first n natural numbers

    }
    static void  print(int n) {
        if(n==5){
            System.out.println(n);
           return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
