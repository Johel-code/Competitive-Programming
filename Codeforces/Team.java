import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int res = 0;

        for(int i=0; i<n ; i++){
            int first = sc.nextInt();
            int second = sc.nextInt();
            int thirdth = sc.nextInt();

            if(first+second+thirdth > 1)
                res++;
        }
        System.out.print(res);
        sc.close();
    }
    
}
