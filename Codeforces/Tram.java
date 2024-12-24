import java.util.Scanner;

/**
 * Tram
 */
public class Tram {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    int max = 0;
    int total = 0;

    for (int i = 0; i < t; i++) {
      int salen, entran;
      salen = sc.nextInt();
      entran = sc.nextInt();

      total = total - salen + entran;
      max = Math.max(total, max);
    }

    System.out.println(max);

    sc.close();
  }
}
