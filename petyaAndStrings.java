import java.util.Scanner;

public class petyaAndStrings {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  String str1 = in.nextLine().toLowerCase();
  String str2 = in.nextLine().toLowerCase();
  int counter = 0;
  if (str1.compareTo(str2) > 0) {
    counter = 1;
  } else if (str1.compareTo(str2) < 0) {
    counter = -1;
  }
  System.out.println(counter);
  in.close();
 } 
}
