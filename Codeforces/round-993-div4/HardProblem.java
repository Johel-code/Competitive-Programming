import java.util.Scanner;

/**
 * HardProblem
 */
public class HardProblem {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    for (int i = 0; i < t; i++) {
      int m, a, b, c, d1, d2;
      m = sc.nextInt();
      a = sc.nextInt();
      b = sc.nextInt();
      c = sc.nextInt();

      int res = 0;

      if (m >= a + b + c) {

        res = a + b + c;
      } else {
        if (a >= m) {
          res = m;
        } else {
          d1 = Math.min(m - a, c);
          res = a + d1;
          c = c - d1;
        }
        if (b >= m) {
          res += m;
        } else {
          d2 = Math.min(m - b, c);
          res += b + d2;
        }
      }

      System.out.println(res);

    }

    sc.close();
  }
}
