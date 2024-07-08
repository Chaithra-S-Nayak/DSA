public class NumberPyramid{
  // number pyramid
  public static void numberPyramid(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.print("\n");
    }
  }
  
  public static void main(String[] args) {
    numberPyramid(5);
  }
}
