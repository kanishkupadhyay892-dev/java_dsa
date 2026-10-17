package BinarySearch;
import java.util.Arrays;
 //Leetcode question 34 , find first and last position of element in sorted array.
public class Leetcode34 {
    public static void main(String[] args){
        int[] nums={5,7,7,8,8,10};
        int target=7;
        int []ans= SearchRange(nums, target);
        System.out.println(Arrays.toString(ans));

    }
     static int [] SearchRange(int [] nums, int target){
         int[] ans={-1,-1};
          ans[0]= binarySearch(nums, target, true);
          ans[1]= binarySearch(nums, target, false);
         return ans;

     }
     static int binarySearch(int[] nums, int target, boolean firstOccurrence) {
         int ans = -1;
         int start = 0, end = nums.length - 1;
         while (start <= end) {
             int mid = start + (end - start) / 2;
             if (nums[mid] < target) {
                 start = mid + 1;
             } else if (nums[mid] > target) {
                 end = mid - 1;
             } else {
                 ans = mid; // found target
                 if (firstOccurrence) {
                     end = mid - 1; // search left
                 } else {
                     start = mid + 1; // search right
                 }
             }
         }
         return ans;
     }
 }//main