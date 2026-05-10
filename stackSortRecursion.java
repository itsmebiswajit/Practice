import java.util.*;
class Main {
    public static void insert(Stack<Integer> st, int temp){
        if(st.size()==0 || st.peek()>=temp){
            st.push(temp);
            return;
        }    
        int n=st.pop();
        insert(st, temp);
        st.push(n);
    }
    
    public static void sort(Stack<Integer> st){
        if(st.size()==1){
            return;
        }
        int temp=st.pop();
        sort(st);
        insert(st, temp);
        
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(4);
        st.push(1);
        st.push(2);
        st.push(9);
        st.push(0);
        st.push(3);
        sort(st);
        
        System.out.print(st);

    }
}
