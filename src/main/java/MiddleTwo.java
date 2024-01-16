import java.util.Scanner;

public class MiddleTwo {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

       // int wL = word.length();
        if (  word.length() % 2 != 0 &&  word.length() >= 5) {
            System.out.println(("" + word.charAt( word.length()/2-1)+word.charAt( word.length()/2)+word.charAt( word.length()/2+1)));
        }
        else {
            System.out.println("invalid");
        }
    }
}


//If the word has odd number of characters
//and has 5 or more characters, print the middle three
//characters of the word.
//Otherwise print "invalid".
//fifteen ==> fte
//apple ==> ppl
//hey ==> invalid
//java ==> invalid
//whatsup ==> ats
//$ ==> invalid