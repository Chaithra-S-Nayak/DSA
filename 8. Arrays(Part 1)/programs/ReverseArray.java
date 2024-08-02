public class ReverseArray {
    public static void reverseArray(int num[]) {
        for (int i = 0; i < num.length / 2; i++) {
            int temp = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 100, 12, 14, 3 };
        reverseArray(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}