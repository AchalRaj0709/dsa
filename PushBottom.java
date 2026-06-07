import java.util.*;

public class PushBottom {

    public static void pushBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int val=s.pop();
        pushBottom(s,data);
        s.push(val);
        return;

    }

    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        pushBottom(st,4);
        
        while(st.isEmpty() != true){
            System.out.println(st.pop());
        }


    }
}