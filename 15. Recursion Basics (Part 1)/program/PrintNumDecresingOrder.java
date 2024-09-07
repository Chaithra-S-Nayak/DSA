public class PrintNumDecresingOrder{
    public static void printn(int n){
        if(n==1){ //base case
            System.out.println(n); //work
            return;
        }
        System.out.println(n);
        printn(n-1); //recursion
    }
    public static void main(String args[]){
        printn(10);
    }
}