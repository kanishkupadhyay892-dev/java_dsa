package Array.Questions;
import java.util.Arrays;
//Given an array, shift all the 0s to the end while keeping the order of non‑zero elements the same.
//
//Example:
//Input → [1, 0, 2, 0, 3, 4]
//Output → [1, 2, 3, 4, 0, 0]
public class MoveZerosToEnd {
   public  static void main() {
          int []arr={1, 0, 2, 0, 3, 4};
          moveZeroes(arr);
          System.out.println(Arrays.toString(arr));
    }
    static void moveZeroes(int [] arr){

        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){

                arr[j]=arr[i];
                j++;
            }

        }
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }



    }

}
