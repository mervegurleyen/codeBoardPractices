import java.util.Scanner;

public class BuildaRoot {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();
        String route= "";

        for (int i=0; i<4; i++) {

	        if (start.equals(end)){
	          if (i!=0){
	            route = route.substring(0,route.length()-3);
	            System.out.println(route + ": " + start + " found");
	          } else {
	            System.out.println(route + start + " found");
	          }
//	          break;
	        }

	        if (start.equals("A")){
	          route = route + "right";
	          start = "B";
	        } else if (start.equals("B")){
	          route = route + "down";
	          start = "C";
	        } else if (start.equals("C")){
	          route = route + "left";
	          start = "D";
	        } else {
	          route = route + "up";
	          start = "A";
	        }
	        route = route + " > ";

	      }




        }
}

// Your program should take 2 parameters: start point and end point.
// Use left, right, up and down for navigation. Insert ">" between commands. If start point equals to end point - display:
//"start/end(start or end variable!) found"(See the example).
//Note: you may move only clock wise.
//Example:
//Input: A
//Input: D
//Output: right > down > left: D found
//Input: B
//Input: D
//Output: down > left: D found
//Input: C
//Input: C
//Output: C found