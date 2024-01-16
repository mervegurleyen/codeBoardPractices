import java.util.Scanner;

public class printHalfTwice {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String first2 = word.substring(0, (word.length()/2));
        System.out.println(first2+first2);
    }
}


//Write a program that will print out first half of the word twice.
//
//Example for even number words
//
//input: java
//output: jaja