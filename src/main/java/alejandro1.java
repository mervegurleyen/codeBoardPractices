import java.util.Scanner;

public class alejandro1 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        //your code here
        if ( a.contains("alejandro")) {
            System.out.println("read this mail");
        }
        else {
            System.out.println("don't read");
        }

    }
}


//He has a large number of text emails, going trough all of them will take a lot of time.
//to save time he will only read the emails that refer to him by name.
//He wants to write a program that takes the email content as string and if his name "alejandro" exists in email
// content, then program prints "read this mail" else it will output "don't read".
//for example:
//a = "dear alejandro.....alot of text"
//outputs: "read this mail"
//a = "thunder blaz is the best drink in the galaxy..."
//outputs: "don't read"
//a = "subject : important project, alejandro we refer to you  this ...."
//outputs: "read this mail"