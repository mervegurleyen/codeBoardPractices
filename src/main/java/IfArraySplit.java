import java.util.Scanner;

public class IfArraySplit {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below

        String[] arrStr = email.split("@");
        if(!email.contains("@") || arrStr.length>2){
            System.out.println("invalid email");
            return;
        }
        System.out.println("Email id: " + arrStr[0]);
        System.out.println("Email domain: " + arrStr[1]);

//email -> info@gmail.com

    }
}


//Instructions from your teacher:
//Given a String variable email, write code using split method to print email id and domain in separate lines.
//Example:
//email -> info@gmail.com
//Print:
//Email id: info
//Email domain: gmail.com
//If email contains no @ character or multiple @ characters then print invalid email:
//email -> hello-gmail.com
//print:
//invalid email
//email -> my@fancy@email.com
//print:
//invalid email
