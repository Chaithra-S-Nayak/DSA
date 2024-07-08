public class Butterfly {
  public static void main (String[] args) {
    // Butterfly Pattern
    int n = 8;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if ((i - j >= 0 && i + j <= (n + 1)) || (i + j >= n + 1 && j - i >= 0)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print("\n");
    }
  }
}
