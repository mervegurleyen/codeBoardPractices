import java.util.Scanner;

public class NforLoops {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int end = inp.nextInt();

        for (int i=1; i<=end; i++){
            System.out.print(i+" ");
        }
    }
}
//int end;
//Write a for loop that will print out the numbers starting at 1 and ending at the input inclusive.
// The numbers printed should all be on the same line separated by a space.
//Sample inputs/outputs:
//In: 5
//1 2 3 4 5
//In: 10
//1 2 3 4 5 6 7 8 9 10
//In: -5
//(no output)