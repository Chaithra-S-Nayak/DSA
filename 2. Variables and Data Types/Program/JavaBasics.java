//Boilerplate code
// public class JavaBasics{
//     public static void main(String args[]){
//         System.out.print("1 2 3 4 5");
//     }
// }

// public class JavaBasics{
//     public static void main(String args[]){
//         int a=10,b=5;
//         int sum=a+b;
//         System.out.print(sum);
//     }
// }

import java.util.Scanner;
public class JavaBasics{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter sentence:");
        // String input=sc.nextLine();
        // System.out.print("Enter word:");
        // String input=sc.next();
        System.out.print("Enter boolean:");
        Boolean input=sc.nextBoolean();
        System.out.print("You entered "+input);
        sc.close();
    }
}