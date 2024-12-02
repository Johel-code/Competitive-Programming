import java.util.Scanner;

public class LongWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        
        for(int i=0; i< n; i++){
            String word = in.next();
            if(word.length() > 10 )
                System.out.println(word.charAt(0) + "" + (word.length()-2) +""+ word.charAt(word.length()-1));
            else 
                System.out.println(word);
        }
        in.close();
    }
}
