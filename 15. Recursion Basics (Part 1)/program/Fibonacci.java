public class Fibonacci{
    public static int fibonacci(int n){
        if(n==1|| n==0){
            return n;
        }
        int f= fibonacci(n-1) +fibonacci(n-2);
        return f;
    }
    public static void main(String args[]){
        int f= fibonacci(5);
        System.out.println(f);
    }
}