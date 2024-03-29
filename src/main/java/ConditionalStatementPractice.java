import java.util.Scanner;

public class ConditionalStatementPractice {


    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();

        if(word.endsWith("ey")){
            System.out.println("-eys");
        }

        else if(word.endsWith("y")){
            System.out.println("-ies");
        }
        else if(word.endsWith("ife")){
            System.out.println("-ives");
        }
        else
            System.out.println("-s");

    }
}


//Given a string variable "word", do the following tests
//If the word ends in "y", print "ies"
//If the word ends in "ey", print "-eys"
//If the word ends in "ife", print "-ives"
//If none of the above is true, print "-s"
//No more than one should be printed.