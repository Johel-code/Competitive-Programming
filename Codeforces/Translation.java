import java.util.Scanner;

/**
 * Translation
 */
public class Translation {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String a = sc.nextLine();
    String b = sc.nextLine();

    String res = "NO";

    if (a.length() == b.length()) {
      String aux = "";
      for (int i = a.length() - 1; i >= 0; i--) {
        char act = a.charAt(i);
        aux += act;
      }
      if (aux.equals(b))
        res = "YES";
    }

    System.out.println(res);

    sc.close();
  }
}
