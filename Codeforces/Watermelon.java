import java.util.*;

public class Watermelon {

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if(n>3 && n%2 == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");

        }

    }
}