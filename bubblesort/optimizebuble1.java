import java.util.*;
public class optimizebuble1 {
    static void bubblesort(int arr []){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean flag = false;// is any swaping happened
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
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
        int [] arr = { 4,7,2,6,1};
        bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
