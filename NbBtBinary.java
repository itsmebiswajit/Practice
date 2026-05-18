Question:

Generate N-bit Binary Numbers
Generate all binary numbers of length N such that:

In every prefix of the string, number of 1s is greater than or equal to number of 0s.

Example for N = 3:

Valid:
111
110
101

Invalid:
100
010

  




import java.util.*;
class Main {
    public static void func(int n, int o, int z, String s, ArrayList<String> list){
        if(n==0){
            list.add(s);
            return;
        }
        
        if(o==z){
            func(n-1, o+1, z, s+"1", list);
        }
        
        if(o>z){
            func(n-1, o+1, z, s+"1", list);
            func(n-1, o, z+1, s+"0", list);
        }
    }
    public static void main(String[] args) {
        int n=5;
        int z=0;
        int o=0;
        ArrayList<String> list=new ArrayList<>();
        String s="";
        
        func(n,o,z,s,list);
        System.out.print(list);
        
    }
}
