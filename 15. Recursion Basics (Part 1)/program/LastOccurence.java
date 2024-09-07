//my approach
public class LastOccurence{
    public static int lastOccurence(int arr[], int key, int i){
        if(i<0){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccurence(arr, key, i-1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,4,5};
        System.out.println(lastOccurence(arr,15,arr.length-1));
    }
}