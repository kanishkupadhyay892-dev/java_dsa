package Recursion;
//Fibonacci series 1st no. is 0 and 2nd no. is 1 and next numbers are the
// sum of previous two numbers.
// fibonacci series- 0 1 1 2 3 5 8 13 21 _____

public class Fibonacci {
    public static void main(String []args){
        int ans= fibo(6);
        System.out.println(ans);
    }
    static int fibo(int n){
        // this code return the integer of fibonacci series
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
