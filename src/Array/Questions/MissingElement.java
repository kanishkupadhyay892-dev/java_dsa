package Array.Questions;
//📝 Problem Statement
//You are given an array of size
//        𝑛
//−
//        1
//containing distinct integers in the range from 1 to
//        𝑛
//. The task is to find the missing number in the sequence.
//
//📌 Example
//Input: arr = [1, 2, 4, 5],
//𝑛
//=
//        5
//
//Output: 3
//
//Explanation: The numbers from 1 to 5 should be [1,2,3,4,5]. Here 3 is missing.
public class MissingElement {
    public static void main(String [] args){
        int []arr={1, 3};
        int missingNumber=findMissing(arr);
        System.out.println(missingNumber);

    }static int findMissing(int [] array){
        int n=array.length+1;
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];

        }
        //now calculating for upto n
        int originalSum= n*(n+1)/2;
        int ans= originalSum-sum;
        return ans;
    }

}
