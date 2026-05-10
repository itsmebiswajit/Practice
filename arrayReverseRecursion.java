import java.util.*;
class Main {
    
    //REVERSE AN ARRAY USING RECURSION
    
    public static void insert(ArrayList<Integer> list, int temp){
        if((list.size()==0) || (list.get(list.size()-1)<=temp) ){
            list.add(temp);
            return;
        }
        int n=list.remove(list.size()-1);
        insert(list,temp);
        list.add(n);
    }
    
    public static void sort(ArrayList<Integer> list){
        if(list.size()==1){
            return;
        }
        int temp=list.remove(list.size()-1);
        sort(list);
        insert(list,temp);
        
    }
    

    public static void main(String[] args) {
        
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(0,1,6,2,3,9,8,5,2));
        sort(al);
        System.out.print(al);
 
    }
}
