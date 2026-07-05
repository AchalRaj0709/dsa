import java.util.*;
public class StringReverse {

    public static void main(String[] args) {
        Stack<Character> s=new Stack<>();
        String str="Hello";
        String res="";

        for(int i=0;i<str.length();i++){
            s.push(str.charAt(i));
        }
        while(s.isEmpty() != true){
            res+=s.pop();
        }
        System.out.println(res);
    }
}