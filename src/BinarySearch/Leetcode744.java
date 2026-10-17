package BinarySearch;
import java.util.Scanner;
  // Q. Find smallest letter greater than or equal to target
//You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
// There are at least two different characters in letters.
//
//Return the smallest character in letters that is lexicographically greater than target.
// If such a character does not exist, return the first character in letters.
//
//
//
// Example 1:
//
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.
//Example 2:
//
//Input: letters = ["c","f","j"], target = "c"
//Output: "f"
//Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
//Example 3:
//
//Input: letters = ["x","x","y","y"], target = "z"
//Output: "x"
//Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].

public class Leetcode744 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
          char []letters={'c','f','g'};
          char target=sc.next().charAt(0);
          char ans=ceiling(letters,target);
          System.out.println(ans);
          //we can do this question by ceiling 
    }
    static char ceiling(char []arr, char target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else if(target==arr[mid]){
                start=mid+1;
            }
        }
        return arr[start%arr.length];
    }
}
