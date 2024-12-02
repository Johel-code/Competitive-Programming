
import java.util.Scanner;

public class SoldierAndBananas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int cost = sc.nextInt();
        int money = sc.nextInt();
        int nBananas = sc.nextInt();

        int res = 0;

        for (int i = 1; i < nBananas+1; i++) {
            res += i*cost;
        } 
        res = (res - money) > 0 ? res - money : 0;
        System.out.print(res);
    }
}
