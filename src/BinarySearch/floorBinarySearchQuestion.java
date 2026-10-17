package BinarySearch;
// here we have to find the floor elment of the target
// floor  is greatest element in array  less than or equal to target
public class floorBinarySearchQuestion {
    public static void main(String []args){
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
        return end;
    }
}
