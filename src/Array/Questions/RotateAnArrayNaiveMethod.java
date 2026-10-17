package Array.Questions;
import java.util.Arrays;
//Given an array of integers and a number k, rotate the array by k positions.
//
//In left rotation, the first k elements of the array move to the end.
//
//In right rotation, the last k elements of the array move to the front.
public class RotateAnArrayNaiveMethod {
    public static void main(String [] args){
        int [] arr={1,2,3,4,5};
        String Direction="right";
        int k=3;
        rightRotation(arr,Direction,k);
        System.out.println(Arrays.toString(arr));
        // the complexity of this naive method is log(n.k)
    }
    static void leftRotation(int [] arr,String Direction,int k){
        if(Direction.equals("left")){
            int []temp = new int[k];
                for(int i=0;i<k;i++){
                    temp[i]=arr[i];
                }
                for(int i=0;i<k;i++) {
                    for (int j = 0; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                }
                for(int l=0;l<k;l++){
                    arr[arr.length-1-l]=temp[temp.length-1-l];
                }
        }
    }static void rightRotation(int [] arr,String Direction,int k){
        if(Direction.equals("right")){
            int []temp = new int[k];
            for(int i=0;i<k;i++){
                temp[k-1-i]=arr[arr.length-1-i];
            }
            for(int i=k;i>0;i--) {
                for (int j =arr.length-1-i; j >=0; j--) {
                    arr[j+1]=arr[j];
                }
            }
            for(int l=0;l<k;l++){
                arr[l]=temp[l];
            }
        }
    }


}
