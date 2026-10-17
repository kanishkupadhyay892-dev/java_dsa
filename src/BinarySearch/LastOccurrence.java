package BinarySearch;

public class LastOccurrence {
      static void main(String[] args) {
          int [] arr={1,3,3,5,5,5,7,9};
          int target=3;
          System.out.println(Search(arr,target));

    }static int Search(int [] arr, int target){
        int start=0;
        int end =arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            } else if (arr[mid]<target) {
                start= mid+1;
            }
            else{
                ans=mid;
                start=mid+1;

            }


        }
        return ans;
    }
}
