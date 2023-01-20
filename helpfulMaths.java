import java.util.Arrays;
import java.util.Scanner;

public class helpfulMaths {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String[] str = in.nextLine().split("\\+");
    Arrays.sort(str);
    for (int i = 0; i < str.length; i++) {
      System.out.print(str[i]);
      if (i != str.length - 1) {
        System.out.print('+');
      }
    }
  }
}
