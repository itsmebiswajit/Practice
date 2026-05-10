// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    //FACTORIAL OF A NUMBER
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return fact(n-1)*n;
    }
    
    
    //Nth FIBBONACI NUMBER
    public static int fibbo(int n){
        if (n<=1){
            return n;
        }
        return fibbo(n-1)+fibbo(n-2);
    }
    
    
    //FIBBONACI SERIES
    public static void print(int n){
        if(n==0){
            System.out.print(fibbo(n)+" ");
            return;
        }
        print(n-1);
        System.out.print(fibbo(n)+" ");
    }
    
    
    //SUM OF FIRST N NUMBER
    public static int sum(int n){
        if(n<=1){
            return n;
        }
        return sum(n-1)+n;
    }
    
    
    //SUM OF ARRAY ELEMENTS
    public static int array_sum(int arr[],int n){
        if(n==0){
            return arr[0];
        }
        return array_sum(arr, n-1)+arr[n];
    }
    
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int n=arr.length;
        System.out.print(array_sum(arr, n-1));
        
        // System.out.print(fibbo(7));
        // print(7);
        // System.out.print(sum(10));
    }
}
