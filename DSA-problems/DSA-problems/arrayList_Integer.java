import java.util.*;

public class arrayList_Integer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            int num = sc.nextInt();
           list.add(num);
        }
        System.out.println(list);
        sc.close();

    }
  

}