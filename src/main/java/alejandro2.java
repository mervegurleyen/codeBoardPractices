import java.util.Scanner;

public class alejandro2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        if ( a.contains("Alejandro") || a.contains("project")) {
            System.out.println("read this mail");
        }
        else {
            System.out.println("don't read");
        }
    }
}

//alejandro's time is precious, and even with his little knowledge of programming he managed to save some time.
// But still he had a lot of emails to read.
//He wants to add more conditions to his program, he wants only job related mails,
// so he will narrow it down by also checking if the word "project" and also his name exists in emails,
//that way he will be sure its a job email that refers to him
//If email is job related then display "read this mail" in console otherwise print "don't read"
//a = "dear Alejandro.....alot of text"
//outputs: "don't read"
//a = "thunder blaz is the best drink in the galaxy..."
//outputs: "don't read"
//a = "subject : important project, Alejandro we refer to you  this ...."
//outputs: "read this mail"