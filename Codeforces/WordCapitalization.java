
import java.util.Scanner;

public class WordCapitalization{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        String one = (word.charAt(0) + "").toUpperCase();
        
        for (int i = 1; i < word.length(); i++) {
            one += word.charAt(i);
        }

        System.out.print(one);

    }
}