import java.util.Scanner;

public class ForIfSubstringPrefixAgain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        String prefix = str.substring(0, n);
        System.out.println(str.substring(n, str.length()).contains(prefix));

    }
}
//Given a string, consider the prefix string made of the first n chars of the string.
// Does that prefix string appear somewhere else in the string?
//
//Assume that the string is not empty and that n is in the range from 1 till str.length().
//
//Example:
//
//input: abXYabc
//
//input: 1
//
//output: true
//
//a appears twice
//
//Example:
//
//input: abXYabc
//
//input: 2
//
//output: true
//
//ab appears twice
//
//Example:
//
//input: abXYabc
//
//input: 3
//
//output: false
//
//abX appears once only