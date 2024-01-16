import java.util.Arrays;

public class reversedArrayintoNewArray {

    public static void main(String[] args) {

        int [] temp={3,66,2,89,12,1};
        int[] reversedTemp=new int[temp.length];
        int j=0;
        for (int i=temp.length-1; i>=0; i--){
            reversedTemp[j]=temp[i];
            j++;
        }

        System.out.println(Arrays.toString(reversedTemp));

    }
}
