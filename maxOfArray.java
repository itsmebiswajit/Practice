// Online Java Compiler
// Use this editor to write, compile and run your Java code online

//FIND MAX OF AN ARRAY USING RECURSION

import java.util.*;

class Main {
    
    public static int max_from_array(int arr[],int n){
        if(n==1){
            return arr[0];
        }
        
        int temp=arr[n-1];
        int m=Math.max(temp, max_from_array(arr, n-1));
        return m;
        
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,9,1,6,8};
        System.out.print(max_from_array(arr, arr.length));
    }
}
