import java .util.ArrayList;
public class ArrayList1 {
    public static void main(String[] args){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);

        // int ele=list.get(2);
        // System.out.println(ele);

        // list.remove(2);
        // System.out.println(list);

        // list.set(2,10);
        // System.out.println(list);

        // System.out.println(list.contains(1));

        // System.out.println(list.size());

        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.println(list.get(i)+" ");
        // }

        //Maximum in Arraylist
        // int max=list.get(0);
        // for(int i=0;i<list.size();i++){
        //     max=(Math.max(max,list.get(i)));
        // }
        // System.out.println(max);

        //Swap idx 1 & idx 3
        int ele1=list.get(1);
        list.set(1,list.get(3));
        list.set(3,ele1);
        System.out.println(list);
    }
}
