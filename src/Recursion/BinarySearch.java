package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int target = 7;
        int ans = bs(arr, target, 0, arr.length - 1);
        System.out.println(ans);
    }

    static int bs(int[] arr, int target, int s, int e) {
        if(s>e){
            return -1;
        }
        int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                return bs(arr, target, mid + 1, e);// recursive call if target is greater than middle
            } else {
                return bs(arr, target, s, mid - 1);//recursive call if target is less than middle
            }
        } 
}
