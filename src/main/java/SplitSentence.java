import java.util.Scanner;

public class SplitSentence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] split=sentence.split(" ");

        for (int i=0; i<=split.length-1; i++){
            System.out.println(split[i]);
        }

    }
}
//Instructions from your teacher:
//
//Given a String variable sentence, write code to type each word in separate lines.
//
//Example:
//
//sentence -> "Java is fun"
//
//Print
//
//Java
//
//is
//
//fun