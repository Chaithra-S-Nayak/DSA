import java.util.*;
public class Main
{
    // public static void bubbleSort(int arr[]){
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=0;j<arr.length-1-i;j++){
    //             if(arr[j]<arr[j+1]){
    //                 int temp=arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;
    //             }
    //         }
    //     }
    // }

    // public static void selectionSort(int arr[]){
    //     for(int i=0;i<arr.length-1;i++){
    //         int maxPos=i;
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[maxPos]<arr[j]){
    //                 maxPos=j;
    //             }
    //         }
    //         int temp=arr[i];
    //         arr[i]=arr[maxPos];
    //         arr[maxPos]=temp;
    //     }
    // }

    // public static void insertionSort(int arr[]){
    //     for(int i=1;i<arr.length;i++){
    //         int cur=arr[i];
    //         int prev=i-1;
    //         while(prev>=0 && arr[prev]<cur){
    //             arr[prev+1]=arr[prev];
    //             prev--;
    //         }
    //         arr[prev+1]=cur;
    // }
    // }

        public static void countingSort(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int count[]=new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                arr[j]=i;
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
		int arr[]={3,6,2,1,8,7,4,5,3,1};
		// bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countingSort(arr);
		printArr(arr);
	}
}