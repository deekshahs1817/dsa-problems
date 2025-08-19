import java.util.*;

public class missing_element {
    public long miss_number(int arr[]) {
        int n = arr.length + 1; // including missing element
        long totalSum = (long) n * (n + 1) / 2; // sum of first n natural number
        long arraySum = 0; // sum of array initialization
        for (int num : arr) {
            arraySum += num;// arraysum
        }
        return totalSum - arraySum; // returns the missing value

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Takes input n — the total number of elements (including the missing one)
        int[] arr = new int[n - 1]; // Array to store n-1 elements (since one is missing)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // taking input from user
        }
        missing_element me = new missing_element(); // creating the object
        System.out.println(me.miss_number(arr));
        sc.close();
    }
}