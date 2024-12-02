
import java.util.Scanner;

public class PetyaAndStrings {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line1 = sc.next().toLowerCase();
        String line2 = sc.next().toLowerCase();

        int res=0;

        for (int i = 0; i < line1.length(); i++) {
            char act1 = line1.charAt(i);
            char act2 = line2.charAt(i);

            if(act1 > act2){
                res = 1;
                break;
            }else if (act2 > act1){
                res = -1;
                break;
            }
        }

        System.out.println(res);

    }
}
