import java.util.Scanner;

/**
 * NearlyLuckyNumber
 */
public class NearlyLuckyNumber {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    long n = sc.nextLong();
    int cont = 0;
    String res;

    while (n > 0) {
      long act = n % 10;
      n = n / 10;
      if (act == 4 || act == 7) {

        cont++;
      }
    }

    if (cont == 4 || cont == 7)
      res = "YES";
    else
      res = "NO";

    System.out.println(res);

    sc.close();
  }
}
