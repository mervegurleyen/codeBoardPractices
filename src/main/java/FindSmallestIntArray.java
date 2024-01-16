import java.util.Arrays;
import java.util.stream.IntStream;

public class FindSmallestIntArray {

    public static void main(String[] args) {

        int[]tempArray={23,44,12,99,4};
        int min=tempArray[0];
        for (int i = 0; i <tempArray.length ; i++) {
            if (tempArray[i]<min){
                min=tempArray[i];

            }

        }
        System.out.println(min);



//            Arrays.sort(tempArray);
//            System.out.println(tempArray[0]);
   }
}
