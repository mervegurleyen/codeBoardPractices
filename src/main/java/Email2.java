import java.util.Scanner;

public class Email2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String name = email.substring(0,1).toUpperCase() + (email.substring(1, email.indexOf("_")));
        String lastName = email.substring(email.indexOf("_")+1, email.indexOf("_")+2).toUpperCase() + email.substring(email.indexOf("_")+2, email.indexOf("@"));
        String domain = email.substring((email.indexOf("@")+1), (email.indexOf(".")));
        String extension = email.substring(email.lastIndexOf(".")+1);

        System.out.println("First name: " + name
                + "\nLast name: " + lastName
                + "\nDomain: " + domain
                + "\nTop-Level Domain: " + extension);
    }
}

//Write a program that will print out information (First name, Last name, Domain, Top-Level Domain) about user based on email.
//
//first and last name should start with the upper case like in example.
//
//**Example:**
//
//**Input: craig_federighi@apple.com**
//
//**Output:**
//
//**First name: Craig**
//
//**Last name: Federighi**
//
//**Domain: apple**
//
//**Top-Level Domain: com**