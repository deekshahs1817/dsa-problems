/*public class secound_largest{
    static int secoundLargest(int[] arr){
        int n= arr.length; // length of an Arr
        Arrays.sort(arr); // sort it in increasing order
        for(int i=n-2;i>=0;i--){//start checking from last secound element 
            if(arr[i]!=arr[n-1]){//if  element is not eqals to last element its was the secound largest element
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr={22, 55, 66, 77};
        System.out.println(secoundLargest(arr));
    }
}
 // after sorting last element is the largest element in the array we have to find secound largest by using logic n-2 to 0
 */

 
 public class secound_largest{
    static int secoundLargest(int [] arr){
        int n=arr.length;
        int FL=-1;
        int SL=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>FL)
                FL=arr[i];
                
            
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]>SL && arr[i]!=FL ){
                SL=arr[i];
                
            }
        }
        return SL;
    }
    public static void main(String[] args) {
        int [] arr={22,33,44,55,66,77};
        System.out.println(secoundLargest(arr));
        
    }
    
 }