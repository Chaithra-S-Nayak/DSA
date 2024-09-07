public class Factorial{
    public static int fac(int n){
        if(n==0){
            return 1;
        }
        int num= n*fac(n-1);
        return num;
    }
    public static void main(String args[]){
        int n=fac(3);
        System.out.println(n);
    }
}