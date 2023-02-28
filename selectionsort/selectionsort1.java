import java.util.*;
public class selectionsort1 {
    static void selectionsort(int [] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min_index]){
                    min_index=j;
                }
            }
            if(min_index!=i){ 
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        }
    }
    public static void main(String args[]){
        int arr[] = {7,4,5,1,2};
        selectionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
