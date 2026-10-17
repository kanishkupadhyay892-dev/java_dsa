package Sorting;
import java.util.Arrays;
public class InsertionSort {
    public static void main(String [] args){
        int []arr={78,93,92,-234,-1};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
   static void Insertion(int [] arr){
       for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j>0;j--){
               if (arr[j]<arr[j-1]) {
                  //swap
                  int temp=arr[j];
                  arr[j]=arr[j-1];
                  arr[j-1]=temp;

               }// for sorting in ascending order
               else{
                   break;
               }
           }
       }
   }
}

