package Array.Questions;
//Q. Check if the given array is sorted or not
public class CheckIfArrayIsSorted {
    public static void main(String [] args){
        // we have to check if the given array is sorted or not
        int []arr={2,1,2};
        boolean check=checkArray(arr);
        System.out.println(check);
    }
    static boolean checkArray(int [] array){
        boolean check=false;
        int n= array.length;
        int count =0;
        if(n<=2){
            check=true;
            return check;
        }
        int j=0;
        while (j < n - 1 && array[j]==array[j+1]) {
            j++;
        }
        if(j==n-1){
            check=true;
            return check;
        }
        boolean isAscending = array[j]>array[j+1];
        if(isAscending){
            // now we will check for if array is sorted in ascending order
            for(int i=0;i<n-1; i++){
                if(array[i]<=array[i+1]){
                    count++;
                }


            }if(count ==n-2){
                check=true;
            }

        }
          count =0;
        if(!isAscending){
            // now we will check for if array is sorted in descending order
            for(int i=0;i<n-1; i++){
                if(array[i]>=array[i+1]){
                    count++;
                }


            } if(count ==n-2){
                check=true;
            }
        }

        return check;
    }


}
