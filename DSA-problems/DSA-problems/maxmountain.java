import java.util.*;
public class maxmountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for(int i =0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));

        int maxheight=a[0];
        for(int i=1;i<a.length;i++){
            if(maxheight<a[i]){
                maxheight=a[i];
             
            }
           
        }
           System.out.println(maxheight);
        sc.close();

    }
}
