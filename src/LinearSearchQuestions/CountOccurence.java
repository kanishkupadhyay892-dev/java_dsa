package LinearSearchQuestions;

import java.util.Scanner;

//Given an array of integers and a target element x, write a program to count how many times x occurs in the array using linear search.
//
//You must traverse the array sequentially (no built-in frequency functions).
//
//Return the count of occurrences.
//
//If x is not present, return 0.
public class CountOccurence {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the elements of array(Note the enter elements should be integer)");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element" );
        int target=sc.nextInt();
        int countOfTarget=count(arr,target);
        System.out.println(countOfTarget);
    }
    static int count(int [] arr, int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
}
