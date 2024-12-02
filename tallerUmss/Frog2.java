import java.util.Arrays;
import java.util.Scanner;

public class Frog2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int [] arr = new int[n];
        int [] costos = new int[n];
        Arrays.fill(costos, Integer.MAX_VALUE);

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        costos[0] = 0;

        int cont = k;
        for (int i = 1; i < n; i++) {
            while(cont>0){
                if(cont<=i){
                    int cost = Math.abs(arr[i] - arr[i-cont]) + costos[i-cont];
                    costos[i] = Math.min(costos[i], cost);
                }
                cont--;
            }    
            cont = k;
        }

        System.out.println(costos[n-1]);

        sc.close();
    }
}
