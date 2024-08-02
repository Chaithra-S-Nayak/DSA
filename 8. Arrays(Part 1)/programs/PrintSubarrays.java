public class PrintSubarrays {
    public static void printSubarrays(int num[], int sum[]) {
        int s = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                System.out.print("[");
                for (int k = i; k <= j; k++) {
                    System.out.print("|" + num[k] + "|");
                    sum[s] += num[k];
                }
                s++;
                System.out.print("] ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        int sum[] = new int[(num.length * (num.length + 1)) / 2];

        printSubarrays(num, sum);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sum.length; i++) {

            System.out.print(sum[i] + " ");
            if (sum[i] > max) {
                max = sum[i];
            }
            if (sum[i] < min) {
                min = sum[i];
            }
        }
        System.out.print("\nMax sum " + max + " Min sum " + min);
    }
}