/*
ID: jbsch161
LANG: JAVA
TASK: gift1 
*/
import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

class gift1{
  public static void main (String [] args) throws IOException {
    BufferedReader f = new BufferedReader(new FileReader("gift1.in"));

    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));

    // StringTokenizer st = new StringTokenizer(f.readLine());

    int n = Integer.parseInt(f.readLine()); 
    Map<String, Integer> map = new LinkedHashMap<>();

    for (int i = 0; i < n; i++) {
        String act = f.readLine();
        map.put(act, 0);
    }

    for (int i = 0; i < n; i++) {
        String act = f.readLine();
        StringTokenizer st = new StringTokenizer(f.readLine()) ;

        int money = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        int a = map.get(act);

        if(num!=0){
            map.replace(act, a - (money/num)*num);
            for (int j = 0; j < num; j++) {
                String act2 = f.readLine();
    
                int b = map.get(act2);
    
                map.replace(act2, b + money/num);
            }
        }
        else
            map.replace(act, a + money);

    }

    for (Map.Entry<String, Integer> me : map.entrySet()){
        out.println(me.getKey() + " " + me.getValue());
    }

    out.close();                  
  }
}
