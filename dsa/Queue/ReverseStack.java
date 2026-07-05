import java.util.*;

public class ReverseStack {

    public static void helper(Stack<Integer> s,int d){
        if(s.isEmpty()){
            s.push(d);
            return;
        }
        int val=s.pop();
        helper(s, d);
        s.push(val);
    }

    public  void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return ;
        }
        int d=s.pop();
        reverse(s);
        helper(s, d);

    }

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        ReverseStack r=new ReverseStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        r.reverse(st);
        System.out.println(st);
        


    }

    
}