import java.util.*;
public class ku1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("enter the elements:");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        
            System.out.print(Arrays.toString(a));
            System.out.println();
        
        System.out.print("enter the searching key:");
        int k= sc.nextInt();
        for(int i=0;i<a.length;i++){
            if (a[i]==k){
               System.out.println("yes");
               break;
            
            }
            if(a[i]!=k){
                System.out.println("no");
                break;
            }
            
        }
sc.close();
    }
}
