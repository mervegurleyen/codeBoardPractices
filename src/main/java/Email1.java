import java.util.Scanner;

public class Email1 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String email = scan.next();

            if (email.contains("_")){

              String firstName=email.substring(0,email.indexOf("_"));
                String lastName=email.substring(firstName.length()+1,email.indexOf("@"));
                String swapName=lastName+"_"+firstName;
                System.out.println(swapName+"@gmail.com");
            }
            else
            {
                System.out.println(email);
            }
    }
}


//In this task, you need to swap first name with last name in the email. If email doesn't contain underscore -
// don't change anything
//Example:
//input: mike_tyson@gmail.com
//output: tyson_mike@gmail.com
//Example:
//input: barakobama@gmail.com
//output: barakobama@gmail.com