package Array.Questions;
//Given an array of integers, write a program to find and print all the duplicate elements present in the array.
//
//📌 Example
//Input: arr = [1, 2, 3, 2, 4, 1, 5]
//Output:
//
//Code
//1
//        2
//Explanation: Both 1 and 2 appear more than once.
public class FindDuplicates {
    public static void main(String []args){
        int []arr={1, 2, 2, 3, 1, 4};
        int n=arr.length;
        boolean []visited=new boolean[n];
        // every element of a boolean array is initialized to false by default.

        for(int i=0;i<arr.length;i++){
            if(visited[i]){
                continue;
            }
            int count=1;

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }


            }
            if(count>1){
                System.out.println(arr[i]);
            }
        }
    }
}
