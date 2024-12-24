import java.util.Scanner;

public class AntonAndDanik {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String s = sc.next();

    int contA, contD;
    contA = 0;
    contD = 0;

    for (int i = 0; i < n; i++) {
      char act = s.charAt(i);
      if (act == 'A')
        contA++;
      else
        contD++;
    }

    if (contA > contD)
      System.out.println("Anton");
    else if (contD > contA)
      System.out.println("Danik");
    else
      System.out.println("Friendship");

    sc.close();
  }
}
