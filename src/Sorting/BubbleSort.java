package Sorting;

import java.util.Arrays;
public class BubbleSort{
    public static void main(String[] args){
        //bubble sort
        int [] arr={1,2,3,4,5,6};
        int []ans= bubbleSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] bubbleSort(int []arr){
           boolean swapped=false;
        for(int i=0;i<arr.length-1; i++){
            for(int j=1;j<=arr.length-i-1;j++){
                int temp=0;
                if(arr[j-1]>arr[j]){
                    //now swap
                    temp=arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]=temp;
                    swapped =true;
                }	//sorting in ascending order\

            }
            if(!swapped){
                break;
            }

        }
        return arr;
    }
}