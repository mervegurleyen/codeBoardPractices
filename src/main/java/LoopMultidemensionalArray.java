import java.util.Arrays;

public class LoopMultidemensionalArray {

    public static void main(String[] args) {

//        Print all the values of below array in using
//        nested for loops nested for each loop

        String apps[][] = {
                {"Facebook", "Instagram", "X", "Youtube"},
                {"Bank of America", "TD Bank", "Chase", "Wells Fargo"},
                {"Hotels", "AirBnb", "Expedia"}
        };

        // Using for loop
        for (int i = 0; i < apps.length; i++) {
            String[] appsRow = apps[i];
            for (int j = 0; j < appsRow.length; j++) {
                System.out.println(appsRow[j]);
            }
            System.out.println();

        }
        // Using for-each loop
        for (String[] row : apps) {
            for (String app : row) {
                System.out.println(app);
            }
            System.out.println();
        }
    }
}