// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
class Main {
    public static void delete(Stack<Integer> st, int k){
        if(1==k){
            st.pop();
            return;
        }
        int temp=st.pop();
        delete(st, k-1);
        st.push(temp);
    }
    
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= 8; i++) {
           stack.push(i);
        }
        int n=(stack.size()/2)+1;
        delete(stack, n);
        System.out.print(stack);
    }
}
