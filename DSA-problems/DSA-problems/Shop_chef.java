import java.util.*;
public class Shop_chef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number of Test Cases: ");
        int n = sc.nextInt();
       
        
        while(n>0){
        int N=sc.nextInt();
        int D=sc.nextInt();
        int P=sc.nextInt();
       
         int [] arr=new int[N];
        for(int j=0;j<N;j++){
           arr[j]=sc.nextInt(); 
        }
       int without_coupon=0;
       for(int i=0;i<N;i++){
        without_coupon+=arr[i];
       }
       int with_coupon=D;
       for(int i=0;i<N;i++){
        with_coupon+=Math.max(0, arr[i]-P);
       }
    

            if(with_coupon<without_coupon){
                System.out.println("coupon");
            }else{
                System.out.println("no coupon");
            }
        
        }
    
        sc.close();

    }
}

