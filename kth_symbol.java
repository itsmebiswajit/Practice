K-th Symbol in Grammar

We build rows like this:

Row 1 : 0
Row 2 : 01
Row 3 : 0110
Row 4 : 01101001

Rule:
0 -> 01
1 -> 10

Question:

Given n and k, return the k-th symbol in the n-th row.

Example:
Input:
n = 4
k = 4

Row 4 = 01101001

4th symbol = 0




class Main {
    public static int solve(int n, int k){
        if(n==1 && k==1){
            return 0;
        }
        int mid=(int)(Math.pow(2,n-1))/2;
        if(k<=mid){
            return solve(n-1, k);
        }
        
        else{
            return 1-solve(n-1, k-mid);
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println(solve(4,5));
    }
}
