/*
ID: jbsch161
LANG: JAVA
TASK: friday 
*/
import java.io.*;

public class friday {

    public static void main(String[] args) throws IOException {

        BufferedReader f = new BufferedReader(new FileReader("friday.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));

        int n = Integer.parseInt(f.readLine());

        int year = 1900;
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int[] result = new int[7];

        int ini = 1;

        while (year < 1900+n){
            if ((year%4 == 0 && year%100 != 0) || year%400 == 0){
                months[1] = 29;
            }else
                months[1] = 28;

            for (int j = 0; j < 12; j++) {
                int day13 = ini + 5;
                if(day13 > 7)
                    day13 = day13 - 7;
                result[day13-1] = result[day13 -1] + 1;
                int fin = (months[j]%7) + ini; 
                ini = fin > 7 ? fin-7:fin ;
            }
            year++;
        }

        out.println(result[5]+" "+result[6]+" "+result[0]+" "+result[1]+" "+result[2]+" "+result[3]+" "+result[4]);
        out.close();

    }

}
