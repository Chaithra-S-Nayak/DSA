import java.util.Scanner;
public class Assignment{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Pencil cost ");
        float pencil=sc.nextFloat();
        System.out.print("Enter Pen cost ");
        float pen=sc.nextFloat();
        System.out.print("Enter Eraser cost ");
        float eraser=sc.nextFloat();
        float total=pencil+pen+eraser;
        System.out.println("Total price="+total);
        System.out.println("Total price including gst="+(total+total*0.18));
    }
}