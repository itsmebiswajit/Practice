// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void hanoi(int s, int d, int h, int n){
        if(n==1){
            System.out.println("Plate "+n+" move from " +s+" to "+d);
            return;
        }
        hanoi(s, h, d, n-1);
        System.out.println("Plate "+n+ " move from " +s+" to "+d);
        hanoi(h, d, s, n-1);

        return;
        
        
        
    }
    public static void main(String[] args) {
        int s=1;
        int d=3;
        int h=2;
        
        int n=20;
        hanoi(s,d,h,n);
    }
}
