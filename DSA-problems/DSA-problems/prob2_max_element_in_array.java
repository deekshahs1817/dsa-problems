import java.util.Arrays;
public class prob2_max_element_in_array{
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66};
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
        System.out.println(maxRange(arr,0,4));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    //swapping 2 elements in an array
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
     // finding maximum elements in an array
    static int max(int[] arr){
         int maxval = arr[0];
         for(int i =0;i<arr.length;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
         }
         return maxval;

    }
    //finding maxelement in a particular range
    static int maxRange(int[] arr,int start,int end){
        int maxval = arr[start];
        for(int i=start;i<end;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
     // printing reverse of an array
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}