package String;
import java.util.Arrays;
//Write a function that reverses a string. The input string is given as an array of characters s.
//
//You must do this by modifying the input array in-place with O(1) extra memory.
//
//
//
//Example 1:
//
//Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
//Example 2:
//
//Input: s = ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]
public class Leetcode344 {
   public static void main() {
      char [] s={'h','e','l','l','o'};
      for(int  left=0,right =s.length-1;left<right;left++,right--){
          //swap
          char temp=s[left];
          s[left]=s[right];
          s[right]=temp;
      }
       System.out.println(Arrays.toString(s));
    }
}
