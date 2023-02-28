//Given an integer array arr , move all 0's to the end of it while maintaining relative order of the non-zeros elements.
import java.util.*;
public class questions1 {
    static void movezeros(int [] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==0 && arr[j+1] != 0){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                return;
            }
        }        
    }
    public static void main(String args[]){
        int [] arr = {0,5,0,3,4,2};
        movezeros(arr);
        for(int val:arr){
            System.out.print(val + " ");
        }
    }
    
}
