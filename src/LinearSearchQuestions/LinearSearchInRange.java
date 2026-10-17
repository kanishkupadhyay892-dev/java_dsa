package LinearSearchQuestions;

public class LinearSearchInRange {
    static int ls(int []arr,int  target,int start, int end){
        if(arr.length==0){
            return -1;
        }
        //let's try to search
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[]args){
       int []arr={23,56,27,67,56,78,9,3};
       int target=3;
       int result=ls(arr,target,1,7);
        System.out.println(result);
    }
}
