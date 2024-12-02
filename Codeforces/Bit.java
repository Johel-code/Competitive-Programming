import java.util.Scanner;

public class Bit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int res = 0;

        for (int i = 0; i < n; i++) {
            String a = sc.next();

            if(a.charAt(1) == '+')
                res++;
            else
                res--;
        }

        System.out.println(res);

        sc.close();
    }
    
}
