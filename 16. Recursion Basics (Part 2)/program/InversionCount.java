import java.util.Scanner;
class InversionCount {
    static int count = 0;
    public static int[] mergeTwoSortedArrays(int[] left, int[] right){
        int n = left.length;
        int m = right.length;

        int[] res = new int[n+m];

        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m){
            if(left[i] < right[j]){
                res[k] = left[i];
                i++;
            } else {
                res[k] = right[j];
                count += (n-i);
                j++;
            }
            k++;
        }

        while(i<n){
            res[k] = left[i];
            i++;
            k++;
        }

        while(j<m){
            res[k] = right[j];
            j++;
            k++;
        }

        return res;
    }

    public static int[] countInversions(int[] arr, int si, int ei){
        if(si == ei){
            int[] ba = new int[1];
            ba[0] = arr[si];

            return ba;
        }
        int mid = (si+ei)/2;

        int[] left = countInversions(arr, si, mid);
        int[] right = countInversions(arr, mid+1, ei);

        int[] res = mergeTwoSortedArrays(left,right);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,3,5};
        int[] res = countInversions(arr,0,4);
        System.out.println(count);
    }
}
