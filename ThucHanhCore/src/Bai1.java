import java.util.Scanner;

public class Bai1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n > 99 && n < 1000) {
      int hangdonvi = n % 10;
      n /= 10;
      int hangchuc = n % 10;
      int hangtram = n / 10;
      System.out.printf("%d%d%d", hangdonvi, hangchuc, hangtram);
    } else {
      System.out.println("n phai co 3 chu so");
    }
  }
}
