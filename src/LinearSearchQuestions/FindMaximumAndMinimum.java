package LinearSearchQuestions;
import java.util.Scanner;
public class FindMaximumAndMinimum {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array(Note the enter elements should be integer)");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        if(n==0){
            System.out.println("array is empty");
        }
        else{
            int maxElement=MaxValue(arr);
            int minElement=MinValue(arr);
             System.out.println("Max element="+" "+maxElement );
             System.out.println("Min element="+" "+minElement);
        }

    }
    static int MaxValue(int []arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    static int MinValue(int []arr){
       int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
