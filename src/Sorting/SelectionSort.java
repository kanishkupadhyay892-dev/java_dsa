package Sorting;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int [] arr){
        for(int i=0;i<arr.length;i++){
            int start=0;
            int last=arr.length-i-1;
            int maxValue=MaxIndex(arr,start,last);
            int temp=arr[last];
            arr[last]=arr[maxValue];
            arr[maxValue]=temp;// swap the max value to its respective position
        }
    }
    static int MaxIndex(int [] arr, int start, int last){
        int max=start;
        for(int i=start; i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

}
