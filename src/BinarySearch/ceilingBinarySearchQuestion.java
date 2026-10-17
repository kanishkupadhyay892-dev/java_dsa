package BinarySearch;
// here we have to find the ceiling of the target value
// ceiling is smallest element in array greater than or equal to target.
public class ceilingBinarySearchQuestion {
    public static void main(String[]args){
      int []arr={1,2,3,56,67,34,43};
      int target= 4;

      System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int []nums, int target){
        int start= 0;
        int end= nums.length-1;
        while(start<=end){
            int mid= start + (end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }else if(nums[mid]>target){
                end =mid-1;
            } else{
                return mid;
            }
        }
        return start;
    }
}
