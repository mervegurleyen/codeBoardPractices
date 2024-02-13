import java.util.Scanner;

public class ArraySubstringPrintFirstandLast {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};
        String result = "";
        for (int j = 0; j < words.length; j++) {
            result += (words[j].substring(0, 1) + words[j].substring(words[j].length() - 1) + ", ");
        }
        System.out.println("[" + result.substring(0, result.length()-2) + "]");
    }
        }


//Given a String array words, iterate through each word and print first and last letter of each element in the format below.
//
//Example:
//
//words → ["hello", "why", "by", "apple" , "note"]
//
//print → ho, wy, by, ae, ne