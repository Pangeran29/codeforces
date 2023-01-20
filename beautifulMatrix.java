import java.util.Scanner;

public class beautifulMatrix {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] array = new int[5][5];
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        array[i][j] = in.nextInt();
      }
    }
    int move = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        if (array[i][j] != 0) {;
          move = Math.abs(i-2) + Math.abs(j-2);
        }
      }
    }
    System.out.println(move);
    in.close();
  }
}