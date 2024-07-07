//here we dont store the reversed number . we just print the last digits
import java.util.Scanner;
class PrintReverse{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to reverse");
        int n=sc.nextInt();
        while(n!=0){
            int r=n%10;
            System.out.print(r);
            n=n/10;
        }
    }
}