import java.util.Scanner;

public class SubStringHasJava {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //Write Your code here
        if(word.length() >=4) {
            if((word.substring(0,4).contains("java")) || (word.substring(1,5).contains("java"))){
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
        else {
            System.out.println(false);
        }



    }
}
//# **Given a string word, print true if "java"
// appears starting at index 0 or 1 in the string, such as with "javaxxx" or "xjavaxx" but not "xxjavaxx".
// The string may be any length, including 0word = .**
//
//Example:
//
//input: javapython
//
//output: true
//
//Example:
//
//input: cjavac++
//
//output: true
//
//Example:
//
//input: c#javaruby
//
//output: false