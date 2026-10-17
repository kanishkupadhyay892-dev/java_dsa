package Array.Questions;

public class FindSmallestElement {
    public static void main(String []args){
        int [] arr = {78,1,2,3,4,5,6,7,86,-23};
        // we have to find the smallest element
        int minElement=Smallest(arr);
        System.out.println(minElement);
    }
      static int Smallest(int []arr){
          int min =arr[0];
          for(int m =0;m<arr.length ; m++){
              if(min>arr[m]){
                  min=arr[m];
              }
          }
         return min;
      }

}
