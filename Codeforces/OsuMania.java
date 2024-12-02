import java.util.Scanner;
import java.util.Stack;

public class OsuMania {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            Stack<String> pila = new Stack<>();
            for (int j = 0; j < n; j++) {
                pila.push(sc.next());
            }
            while(!pila.empty()){
                String act = pila.pop();
                System.out.print(act.indexOf('#')+1+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
