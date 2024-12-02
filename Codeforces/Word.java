
import static java.lang.Character.isUpperCase;
import java.util.Scanner;

public class Word {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        int contUpperCase = 0;
        for (int i = 0; i < word.length(); i++) {
            char act = word.charAt(i);
            if(isUpperCase(act)){
                contUpperCase++;
            }
        }

        if(contUpperCase > word.length()/2){
            System.out.print(word.toUpperCase());
        }else{
            System.out.print(word.toLowerCase());
        }

        sc.close();
    }
}
