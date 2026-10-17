package Basic;
import java.util.Scanner;
public class counting {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
       System.out.println("give input of any integer value");
    int num=sc.nextInt();
    int count=0;
    System.out.println("the number you want to count in the value of integer");
    int k=sc.nextInt();
    while(num>0){
       int temp=num%10;
       num=num/10;
           if(temp==k){
               count++;
           }
    }
       System.out.println(count);
   }
}
