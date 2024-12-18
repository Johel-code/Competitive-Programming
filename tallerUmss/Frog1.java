import java.util.Scanner;

public class Frog1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    int[] dp = new int[n];

    arr[0] = sc.nextInt();
    arr[1] = sc.nextInt();

    dp[0] = 0;
    dp[1] = Math.abs(arr[1] - arr[0]);

    for (int i = 2; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    for (int i = 2; i < n; i++) {
      int mov1 = Math.abs(arr[i] - arr[i - 1]) + dp[i - 1];
      int mov2 = Math.abs(arr[i] - arr[i - 2]) + dp[i - 2];
      dp[i] = Math.min(mov1, mov2);
    }

    System.out.println(dp[n - 1]);

    sc.close();
  }
}
