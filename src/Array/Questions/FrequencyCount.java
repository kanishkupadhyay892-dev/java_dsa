package Array.Questions;
//📝 Problem Statement
//Given an array of integers, write a program to count the frequency of each distinct element present in the array.
//
//📌 Example
//Input: arr = [1, 2, 2, 3, 1, 4]
//Output:
//
//Code
//1 → 2 times
//2 → 2 times
//3 → 1 time
//4 → 1 time
public class FrequencyCount {
    public static void main() {
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
           System.out.println(arr[i]+"-"+count+" times");
       }
    }
}
