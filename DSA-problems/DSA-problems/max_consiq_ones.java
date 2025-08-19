public class max_consiq_ones {
    static int max_consiq(int [] arr){
        int n=arr.length;
        int maxcount=0,count=1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
            count++;
        } else{
            maxcount=Math.max(maxcount,count);
            count=1;
        }


    }
    return Math.max(maxcount,count);
    }
    public static void main(String[] args) {
        int [] arr={0,1,1,1,0,0,1};
        System.out.println(max_consiq(arr));
    }
}
