import java.util.Scanner;

public class StringNoEnd {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();

        String[] newStr=txt.split("");

            for (int i=0; i< newStr.length-1; i++){
                System.out.print(newStr[i]);
            }

//      second method below
       // System.out.println(txt.substring(0, (txt.length())-1));

    }
}
//In this exercise you get a string called txt .
//output txt without its last letter.
//for example:
//txt = "foo"
//output will be:
//fo