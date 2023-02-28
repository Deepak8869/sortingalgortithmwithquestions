//Given an array of names of the fruits ; you are supposed to sort it in lexicographical order using the selection sort .
import java.util.*;
public class question2 {
    static void sort(String [] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min_index =i;
            for(int j=i+1;j<n;j++){
                if(arr[j].compareTo(arr[min_index])<0){
                    min_index = j;
                }
            }
            //swaps 
            String temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    public static void main(String[] args) {
         String [] fruits = {"kiwi","apple","papaya","mango"};
         sort(fruits);
         for(String val : fruits){
            System.out.print(val + " ");
         }        
    }
}
