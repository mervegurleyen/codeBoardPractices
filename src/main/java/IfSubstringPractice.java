import java.util.Arrays;
import java.util.Scanner;

public class IfSubstringPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String html = scan.nextLine();

       // System.out.println(html.substring(html.indexOf("id")+4,html.lastIndexOf('"')));
        if (html.contains("id")){
            System.out.println(html.substring(html.indexOf("id")+4,html.lastIndexOf('"')));
        }
        else {
            System.out.println("Invalid input!");
        }
    }
}

//Write a program, that will read html variable and output attribute value
// of id`` attribute (tag) into the console. Input will be provided in a single line as outlined below.
// If html variable doesn't contain id attribute, print out into the console message: "Invalid input!".
//Example:
//
//input: <!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
//
//output: myi