import java.util.Scanner;

/**
 * NormalProblem
 */
public class NormalProblem {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      String a = sc.next();
      int n = a.length();
      String res = "";

      for (int j = n - 1; j >= 0; j--) {

        char act = a.charAt(j);
        if (act == 'p') {
          act = 'q';
        } else {
          if (act == 'q')
            act = 'p';
        }

        res += act;

      }

      System.out.println(res);
    }

    sc.close();

  }
}
