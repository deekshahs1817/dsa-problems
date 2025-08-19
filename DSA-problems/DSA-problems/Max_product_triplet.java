import java.util.*;
public class Max_product_triplet {

    static int max_prod(int [] arr){
        int n=arr.length;
        Arrays.sort(arr);
        return Math.max(arr[0]*arr[1]*arr[n-1],arr[n-1]*arr[n-2]*arr[n-3]);
    }
    public static void main(String[] args) {
        int [] arr = {-3,-9,-2,-7,-8,-9};
        System.out.println(max_prod(arr));
    }
}
// arr[0]*arr[1]*arr[n-1] this is because after sorthing first 2 elemnets are may be negative with larger number than last to (-*-)= (+)
//arr[n-1]*arr[n-2]*arr[n-3] last 3 digits after sorting be a largest