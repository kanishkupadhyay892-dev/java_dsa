package LinearSearchQuestions;
// Given an array of integers (not necessarily sorted) and a target element x,
// write a program to find the first occurrence and last occurrence of x using linear search.
// If x is not present, return -1 for both.
public class FindFirstLastOccurrence {
    public static void main(String []args){
        int []arr={2, 4 ,6, 4 ,8, 4 ,10};
        int target=4;
        int FirstIndex=FirstOccurrence(arr,target);
        int LastIndex=LastOccurrence(arr,target);
        System.out.print(FirstIndex + " "+LastIndex);

    }
    static int FirstOccurrence(int []arr, int target ){
        // here we have to find the first occurrence of target element in given array
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }

        return -1;
    }
    static int LastOccurrence(int [] arr, int target) {
        // here we have to find the last occurrence of target element in given array
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i] == target) {
               return i;
            }

        }return -1;
    }
}
