
import java.util.Scanner;

public class HitTheLottery {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0;

        if(n>=100){
            res = n/100;
            n = n%100;
        }
        if(n>=20){
            res += n/20;
            n = n%20;
        }
        if(n>=10){
            res += n/10;
            n = n%10;
        }
        if(n>=5){
            res += n/5;
            n = n%5;
        }
        res += n;

        System.out.println(res);

        sc.close();

    }
}
