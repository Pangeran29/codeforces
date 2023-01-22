import java.util.Scanner;

public class football {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String str = in.next();
    String answer = "NO";
    int counter = 0;
    if (str.length() > 7) {
      for (int i = 0; i < str.length()-1; i++) {
        if (str.charAt(i) == str.charAt(i+1)) {
          counter+=1;
          if (counter == 6) {
            answer = "YES";
            break;
          }
        } else {
          counter = 0;
        }
      }
    }
    System.out.println(answer);
    in.close(); 
  }
}
