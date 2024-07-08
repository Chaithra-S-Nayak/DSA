public class InvertedHalfPyramidWithNumbers{
  public static void main (String[] args) {
    // INVERTED HALF-PYRAMID with Numbers pattern
    int n = 5;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }
}
