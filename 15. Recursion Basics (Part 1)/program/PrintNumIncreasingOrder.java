public class PrintNumIncreasingOrder{
    public static void printn(int n){
        if(n==1){ //base case
            System.out.println(n); //work
            return;
        }
        printn(n-1); //recursion
        System.out.println(n);
        
    }
    public static void main(String args[]){
        printn(10);
    }
}