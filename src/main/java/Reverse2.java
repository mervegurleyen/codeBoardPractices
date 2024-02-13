import java.util.Scanner;

public class Reverse2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String reversed = "";
        //TODO: start your code here
        String [] reverse=sentence.split(" ");
        for (int i=reverse.length-1; i>=0; i--){
            reversed=reversed+reverse[i]+ " ";
        }

        //End your code here. do not modify below statement
        System.out.println(reversed);


    }
}
//Instructions from your teacher:
//
//Given a String variable sentence, write code to get each word and assign to String reversed in reverse order.
//
//Example:
//
//sentence -> "Java is fun"
//
//reversed -> "fun is Java"