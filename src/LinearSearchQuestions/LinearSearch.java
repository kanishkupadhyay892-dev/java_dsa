package LinearSearchQuestions;
public class LinearSearch{
    public static void main(String[]args){
        int []arr={765,34,67,89,34,23,68};
        int target=67;
       int ans=searchElement(arr,target);
       System.out.println(ans);
    }
    static int searchElement(int []arr, int target){
        // if the array is empty
        if(arr.length==0){
            return -1;
        }

        // 'for' loop to search for the target value
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        // if the target does not found in whole array
        // then this statement is executed.
        return -1;
    }
}