import java.util.Scanner;

public class ForArraySubstringReverse {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

       String[] newStence= sentence.split(" ");
       for (int i=newStence.length-1; i>=0;i--){

           System.out.println(newStence[i]);
       }

    }
}
//Given a String variable sentence, write code to type each word in separate lines in a reverse order.
//Example:
//sentence -> "Java is fun"
//Print
//fun
//is
//Java