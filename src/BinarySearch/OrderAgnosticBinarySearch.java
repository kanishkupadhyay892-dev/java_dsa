package BinarySearch;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int []arr={78,76,74,71,67,64,62,32,12};
        int  n=sc.nextInt();
        int ans= art(arr,n) ;

        System.out.println(ans);
    }
    static  int art(int []arr,int target){
     //let's first find if the array is ascending or descending
        int start=0;
        int end =arr.length-1;

        boolean isascending;
        if(arr[start]<arr[end]){
            isascending=true;
        }
        else{
            isascending=false;
        }



        while(start<=end){
            int mid = start + (end - start) / 2;
        if(arr[mid]==target) {
            return mid;
        }

            if (isascending) {

                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }
            } else {

                if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
