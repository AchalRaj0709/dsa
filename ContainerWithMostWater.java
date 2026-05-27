import java.util.ArrayList;

public class ContainerWithMostWater {

    public static int mostWater(ArrayList<Integer> arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++){
            int c1=arr.get(i);
            for(int j=i+1;j<arr.size();j++){
                int c2=arr.get(j);
                int w=j-i;
                int h=Math.min(c2,c1);
                max=Math.max(max,(w*h));
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);
        System.out.println(arr);
        System.out.println(mostWater(arr));
    }
}