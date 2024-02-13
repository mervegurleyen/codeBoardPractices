public class HeaderPractice {

    public static void main(String[] args) {

        System.out.println(negate(-5));
    }

    public static double negate(double num){

        return -num;
    }
}
// Write a public static method header on line five with the following specs:
//
//Returns: a double
//
//Name: negate
//
//Parameters: a double called "num"
//
//Then, starting on line 5, write the code that will **return** the **opposite value of num**
// (if it's positive, make it negative, otherwise make it positive) .
//
//Examples:
//
// 4 ==> -4
// -10 ==> 10
// 1 ==> -1