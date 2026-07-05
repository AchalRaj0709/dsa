public class DefectiveProductFilter {

    public static void main(String[] args) {
        int[] arr={85,42,91,67,73,55,88};
        int[] temp=new int[arr.length];
        int th=70,j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=th){
                temp[j++]=arr[i];
            }
        }

        for(int i=0;i<j;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println("\n"+j);
    }
}