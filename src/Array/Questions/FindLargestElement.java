package Array.Questions;

public class FindLargestElement {
    public static void main(String []args){
        int [] arr = {-12,56,1,2,3,4,5,6,7,86};
        // we have to find the largest element
        int maxElement=Largest(arr);
        System.out.println(maxElement);
    }
    static int Largest(int []arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max =arr[i];
            }
        }
        return max;
    }
}
