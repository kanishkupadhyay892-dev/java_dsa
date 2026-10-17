package Array.Questions;
public class FindSecondLargestElement{
    public static void main(String [] args){
        // we have to find the second largest element in an array
        int [] arr ={1,1,1};
        int secondLargest = secondMax(arr);
        int Largest=max(arr);
        System.out.println(secondLargest);


    }
    static int secondMax(int []arr){
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }
        int maxElement= max(arr);
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(secondLargest<arr[i] && arr[i]<maxElement){
                secondLargest=arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element (all elements equal)");
        }
        return secondLargest;
    }
    static int max(int []arr){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}