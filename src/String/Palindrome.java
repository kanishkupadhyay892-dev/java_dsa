package String;

public class Palindrome {
     public static void main(String[] args) {
         boolean ans= palindromeCheck("myself");
        System.out.println(ans? "Palindrome":"Not Palindrome");
    }
    static boolean palindromeCheck(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
           if(str.charAt(left)!= str.charAt(right)){
               return false;//mismatch found
           }
           left++;
           right--;
        }
         return true;//no mismatches
    }
}
