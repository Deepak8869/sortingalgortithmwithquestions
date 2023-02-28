import java.util.*;
class buble1{
    static void bubblesort(int [] arr){
        int n = arr.length;

        // n-1 iterations/passes
        for(int i=0;i<n-1;i++){
             for(int j=0;j<n-i-1;j++){
                /* Last i element already at correct sorted positions
                so no need to check them  */
                if(arr[j] > arr[j+1]){
                    // swap - arr[j],arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                } 
                
             }
        }
    }
  
    public static void main(String args[]){
        int [] arr = {7,6,5,4,3};
        bubblesort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}