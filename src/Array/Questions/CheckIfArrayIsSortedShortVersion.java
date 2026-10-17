package Array.Questions;

public class CheckIfArrayIsSortedShortVersion {
    public static void main(String [] args){
        // we have to check if the given array is sorted or not
        int []arr={2,1,2};
        boolean check=checkArray(arr);
        System.out.println(check);
    }static boolean checkArray(int[] arr) {
        int n = arr.length;
        if (n <= 2) return true;

        // Find first unequal pair
        int i = 0;
        while (i < n - 1 && arr[i] == arr[i + 1]) i++;
        if (i == n - 1) return true; // all equal

        boolean ascending = arr[i] < arr[i + 1];

        for (i=0; i < n - 1; i++) {
            if (ascending && arr[i] > arr[i + 1]) return false;
            if (!ascending && arr[i] < arr[i + 1]) return false;
        }
        return true;
    }
}
