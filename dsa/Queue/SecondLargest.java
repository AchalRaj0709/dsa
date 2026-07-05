import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr={3,5,1,2,8,6,9,7,4};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}