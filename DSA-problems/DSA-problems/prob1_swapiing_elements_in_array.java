import java.util.Arrays;
public class prob1_swapiing_elements_in_array {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        swap(arr,2,5);
        System.out.println(Arrays.toString(arr));
    }
    //swapping 
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    } 
    
} 
