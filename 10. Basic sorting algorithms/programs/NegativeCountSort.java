import java.util.*;
public class NegativeCountSort
{
    public static void countingSort(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }
        int count[]=new int[max-min+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]-min]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i+min;
                j++;
                count[i]--;
            }
        }
    }
	public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
	public static void main(String[] args) {
		int arr[]={-4,-3,-3,1,4,4,2,-3};
        countingSort(arr);
		printArr(arr);
	}
}