package Array.Questions;
import java.util.Arrays;
//Q. Reverse the given array.
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {};
        int [] result= reverseArray(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] reverseArray(int[] arr) {
        if (arr.length == 0) {
            return arr;
        } else if (arr.length == 1) {
            return arr;
        } else {
            method1(arr);// here from this method we are going to reverse given array
        }
        return arr;
    }

    static void method1(int[] array) {
        int n =array.length;
        for(int i=0;i<n/2;i++){
            int temp=array[i];
            array[i]=array[n-1-i];
            array[n-1-i]=temp;
        }

    }
}
