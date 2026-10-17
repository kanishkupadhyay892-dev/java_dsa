package String;
import java.util.Scanner;
import java.util.*;
public class ReverseAString {
    public static void main(String []args){
        // other method
        String name ="kanishk";
        StringBuilder sb = new StringBuilder(name);
        sb.reverse();
        System.out.println(sb);

//        Scanner sc =new Scanner(System.in);
//
//        String name=sc.next();
//        String name2 ="";
//         for(int j=name.length()-1;j>=0;j--){
//            name2 += name.charAt(j);
//
//         }
//         System.out.println(name2);
    }
}
