import java.util.*;
public class thirdLargest {
    static int third_largest(int [] arr){
        int n=arr.length;
        Arrays.sort(arr);

        int first = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(arr[i]>first)
            first=arr[i];
        }
        int secound = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>secound && arr[i]<first)
            secound =arr[i];
        }
         int third = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>third && arr[i]<secound)
            third =arr[i];
        }
        return third;
    }
    public static void main(String[] args) {
        int [] arr = {11,22,33,44,55,66};
        System.out.println(third_largest(arr));
    }
}
