/*
ID: jbsch161
LANG: JAVA
TASK: ride 
*/
import java.io.*;

class Ride{
  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("ride.in"));

    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));

    // StringTokenizer st = new StringTokenizer(f.readLine());

    String i1 = f.readLine(); 
    String i2 = f.readLine();

    String res;
    String abc = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int value1 = 1;
    int value2 = 1;

    for (int i = 0; i < i1.length(); i++) {
       int act = i1.charAt(i) - 'A' +1; 
       System.out.println(act);
       value1 *= act; 
    }

    for (int i = 0; i < i2.length(); i++) {
       int act = abc.indexOf(i2.charAt(i));
       value2 *= act; 
    }

    if(value1%47 == value2%47)
        res = "GO";
    else
        res = "STAY";

    out.println(res);            
    out.close();                  
  }
}