import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SequencedCollection;
import java.util.SequencedMap;

public class ReplaceCharacter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

    for (int i = 0; i < t; i++) {
      int n = sc.nextInt();
      String s = sc.next();
      map.put(s.charAt(0), 1);
      for (int j = 1; j < n; j++) {
        if (map.containsKey(s.charAt(j))) {
          int value = map.get(s.charAt(j)) + 1;
          map.replace(s.charAt(j), value);
        } else {
          map.put(s.charAt(j), 1);
        }

      }
    }

    SequencedCollection<Integer> collect = map.sequencedValues();

    System.out.println(collect);

    sc.close();
  }
}
