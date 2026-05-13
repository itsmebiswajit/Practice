// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void solve(String i, String o){
        if(i.length()==0){
            System.out.println(o);
            return;
        }
        
        solve(i.substring(1), o);
        solve(i.substring(1), o+i.charAt(0));
        return;
    }
    public static void main(String[] args) {
        String i="abcdefgtijkl";
        String o="";
        
        solve(i,o);
    }
}


//Unique Substring

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void subString(String i, String o, Set<String> set){
        if(i.length()==0){
            set.add(o);
            return;
        }
        
        subString(i.substring(1), o, set);
        subString(i.substring(1), o+i.charAt(0), set);
    }
    
    public static void main(String[] args) {
        
        String i="aabc";
        String o="";
        Set <String> set=new HashSet<>();

        
        
        subString(i, o, set);
        
                
        for (String element : set) {
            System.out.println(element);
        }
    }
}
