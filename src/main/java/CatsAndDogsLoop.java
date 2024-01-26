import java.util.Scanner;

public class CatsAndDogsLoop {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < word.length() - 2; i++) {
            if (word.substring(i, (i + 3)).equals("cat"))
                catCount += 1;
            if (word.substring(i, (i + 3)).equals("dog"))
                dogCount += 1;
        }

        if (catCount != dogCount) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
//Print true if the string "cat" and "dog" appear the same number of times in the given string word.
//Example:
//input: catdog
//output: true
//Example:
//input: catcat
//output: false
//Example:
//input: cat-cheetah-dog-cat
//output: false