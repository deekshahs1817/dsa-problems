import java.util.*;
public class arrays_feaut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         // input and creating array 1Dim
        int[] arr = {2,1,4,3,5};
        System.out.println("Original Array 1D: "+Arrays.toString(arr));// printing in array form 1D

        // input and creating array 2Dim
        int[][] arr2D = {
            {2,3,4},
            {5,6,7},
            {8,9,1}};
        System.out.println("Original Array 2D: "+Arrays.deepToString(arr2D));// printing in array form 2D

        // sorting elements in an array
        Arrays.sort(arr);
        System.out.println("Sorting: "+Arrays.toString(arr));

        // searching using binary searching in an array
        Integer index = Arrays.binarySearch(arr,4);
        System.out.println("finding index of the element Binary Search: "+index);

        // copying array 1D
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println("Copying 1D array: "+Arrays.toString(arr2));

        // copying array 2D
        int[][] arr2D2 = {{2,3,4},
                          {5,6,7},
                          {8,9,1}};
        System.out.println("Copying 2D array: "+Arrays.deepToString(arr2D2));

        // finding 2 array are equal or not. (1D)
        System.out.println("finding two 1D arrays are equal: "+Arrays.equals(arr,arr2));

        // finding 2 array are equal or not. (2D)
        System.out.println("finding two 2D arrays are equal: "+Arrays.deepEquals(arr2D,arr2D2));

        // filling entire array with particular number
        int[] arrFill = new int[5];
        Arrays.fill(arrFill,0);
        System.out.println("filling entire array with particular element: "+Arrays.toString(arrFill));

        // copying array new length larger than original
        int [] arr3 = Arrays.copyOf(arr,8);
        System.out.println("copying array with larger length "+Arrays.toString(arr3));

        // copying array of elemnts between particular range
        int[] arr4 = Arrays.copyOfRange(arr,2,5);
        System.out.println("copying array of some particular range of elements: "+Arrays.toString(arr4));
        sc.close();
    }
}
