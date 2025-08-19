import java.util.Scanner;
import java.util.Arrays;
public class arrays_passing_in_functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {22,44,55,88};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
        sc.close();
    }
    static void change(int[] arr){
        arr[0]=99;
        
    }
}
