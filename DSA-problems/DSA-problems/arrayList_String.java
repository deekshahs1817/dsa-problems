import java.util.*;
public class arrayList_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i =0;i<n;i++){
            String name = sc.nextLine();
            names.add(name);
        }
        System.out.println(names);
        sc.close();
        
    }
}
