// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    
    public static int array_sum(int arr[], int n){
        if(n==1) return arr[0];
        int temp=arr[n-1];
        return temp+array_sum(arr, n-1);
    }
        
    public static int power(int a, int b){
        if(b==0) return 1;
        return a*power(a, b-1);
    }
    
    public static int max(int arr[], int n){
        if(1==n) return arr[0];
        int temp=arr[n-1];
        return Math.max(temp, max(arr, n-1));
    }
    
    public static int digit_count(int n){
        if(n==0) return 0;
        return 1+digit_count(n/10);
    }
    
    
    public static void main(String[] args) {
        int arr[]={1,2,3,9,8,4,5};
        int n=7;
        System.out.print(digit_count(1234));
    }
}
