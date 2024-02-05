public class splitMethod {


    public static void main(String[] args) {

        String str="Ain’t nobody got time for that";
       String[] str2= str.split(" ");
       //System.out.println(str2[1]);

      for (int i=str2.length-1; i>=0; i--){
           System.out.println(str2[i]);
       }

    }
}
//Given a String variable sentence, write code to type each word in separate lines in a reverse order.
// ○Example sentence -> "Ain’t nobody got time for that"○
// Output:that
// for
// time
// got
// nobody
// Ain’t