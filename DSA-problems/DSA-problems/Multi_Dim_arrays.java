import java.util.Arrays;
import java.util.Scanner;
public class Multi_Dim_arrays{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        //by Scanner
        int [][] arr = new int [3][3];

        //by code itself
       /* int [][] arr2 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
            
        }; */
        
        //input
        //rows
        for(int row = 0; row<arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                arr[row][col] = sc.nextInt();
            }
        }

        //output

        //for loop
       /*   for(int row = 0; row<arr.length;row++){
            for(int col = 0; col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            } 
            System.out.println();

    }*/

    //Arrays.toString method
    for(int row = 0; row<arr.length;row++){
        System.out.println(Arrays.toString(arr[row]));
    } 

    // for each loop
    /*for(int [] a : arr){
        System.out.println(Arrays.toString(a));
    }
*/

    sc.close();
    }
}