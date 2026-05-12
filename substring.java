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
