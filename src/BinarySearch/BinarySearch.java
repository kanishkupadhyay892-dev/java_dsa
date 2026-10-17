package BinarySearch;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int []arr={2,3,56,78,90,234,678,889};
        int  n=sc.nextInt();
       int ans= art(arr,n) ;

        System.out.println(ans);
    }
   static  int art(int []arr,int target){

       int start=0;
       int end =arr.length-1;

       while(start<=end){
           int mid=start+(end-start)/2;
           if(arr[mid]>target){
               end=mid-1;
           } else if (arr[mid]<target) {
               start= mid+1;
           }
           else{
               return mid;
           }
       }
       return -1;
   }
}
