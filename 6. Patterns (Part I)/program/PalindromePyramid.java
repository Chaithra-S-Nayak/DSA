public class PalindromePyramid {
  // palindrome pyramid
  public static void palindromePyramid(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        int count = j;
        if (count <= i) {
          System.out.print(count);
        } else {
          int diff = j - i;
          count = i - diff;
          System.out.print(count);
        }
      }
      System.out.print("\n");
    }
    
    for (int i = n - 1; i >= 1; i--) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 2 * i - 1; j++) {
        int count = j;
        if (count <= i) {
          System.out.print(count);
        } else {
          int diff = j - i;
          count = i - diff;
          System.out.print(count);
        }
      }
      System.out.print("\n");
    }
  }
  
  public static void main(String[] args) {
    palindromePyramid(4);
  }
}
