import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        String letras = sc.next();

        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < letras.length(); i++) {
           set.add(letras.charAt(i)) ;
        }
        if(set.size()%2 != 0){
            System.out.println("IGNORE HIM!");
        }else{
            System.out.println("CHAT WITH HER!");
        }       
        // Scanner sc = new Scanner(System.in);

        // String isA = sc.next();

        // ArrayList<Character> verificar = new ArrayList<>();

        // verificar.add(isA.charAt(0));

        // for (int i = 1; i < isA.length(); i++) {
        //     char act = isA.charAt(i);

        //     boolean agregar = true;
        //     for (char character : verificar) {
        //         if(act == character){
        //             agregar = false;
        //         }
        //     }
        //     if(agregar){
        //         verificar.add(act);
        //     }
        // }
        // if(verificar.size()%2 != 0){
        //     System.out.println("IGNORE HIM!");
        // }else{
        //     System.out.println("CHAT WITH HER!");
        // }
    }

}
