// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    //BY CREATING A NEW STRING
    public static String reverse1(String s){
        int n=s.length();
        String k="";
        for(int i=0;i<n;i++){
            char c=s.charAt(n-i-1);
            k=k+c;
        }
        return k;
    }
    
    //USING STRINGBUFFER OR STRINGBUILDER
    public static String reverse2(String s){
        int n=s.length();
        StringBuilder sb=new StringBuilder(s);
        
        for(int i=0;i<n/2;i++){
            char c=sb.charAt(i);
            sb.setCharAt(i,(sb.charAt(n-i-1)));
            sb.setCharAt(n-i-1,c);
        }
        return sb.toString();
    }
    
    //JUST BY PRINTING IN REVERSE ORDER
    public static void reverse3(String s){
        int n=s.length();
        for(int i=n-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
    
    //BY USING CHARACTER ARRAY
    public static String reverse4(String s){
        int n=s.length();
        char ch[]=s.toCharArray();
        for(int i=0;i<n/2;i++){
            char c=ch[i];
            ch[i]=ch[n-i-1];
            ch[n-i-1]=c;
        }
        for(int i=0;i<n;i++){
            System.out.print(ch[i]);
        }
        return new String(ch);
    }
    
    //USING RECURSION
    public static String reverse5(String s, int n){
        if(n==0) return Character.toString(s.charAt(0));
        return "" + s.charAt(n) + reverse5(s, n-1);    
    }
    
    
    
    public static void main(String[] args) {
        String s="Biswajit Ghosh";
        int n=s.length();
        System.out.print(reverse5(s, n-1));
        
    }
}
