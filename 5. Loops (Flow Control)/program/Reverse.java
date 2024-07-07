//here we store the reversed number and print reversed number
import java.util.Scanner;
class Reverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to reverse");
        int n=sc.nextInt();
        int reverse=0;
        while(n>0){
            int lastDidit=n%10;
            reverse=(reverse*10)+lastDidit;
            n=n/10;
        }
        System.out.print(reverse);
    }
}