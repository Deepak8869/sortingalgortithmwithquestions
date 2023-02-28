import java.util.*;
public class insertionsort {
    static void insert(int [] arr){
        int n =arr.length;
        for(int i=0;i<n;i++){
            int j=i;

            while(j>0 && arr[j] < arr[j-1]){
                //Swap arr[j] , arr[j-1]
                int temp = arr[j]; 
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String args[]){
        int [] arr = {8,3,6,5,4,2};
        insert(arr);
        for(int val:arr){
            System.out.print(val + " ");
        }
    }
}
