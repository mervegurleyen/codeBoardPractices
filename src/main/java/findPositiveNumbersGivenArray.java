import java.util.Scanner;

public class findPositiveNumbersGivenArray {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int[] numbers=new int[5];
        System.out.println("Please enter 5 numbers: ");

        for (int i=0; i<5; i++){
            numbers[i]=scan.nextInt();
        }
        int positives=countOfPsotive(numbers);
        System.out.println(" Here are positive numbers: "+ positives);

    }

    public static int countOfPsotive(int[] arr){
        int counter = 0;

        for (int i=0; i< arr.length; i++){
            if(arr[i]>0){
                counter++;
            }
        }
        return counter;
    }

}




