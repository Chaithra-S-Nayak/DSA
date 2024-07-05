
// public class TypeCasting{
//     public static void main(String args[]){
//         // int a= (int) (99.99999);
//         // System.out.print(a);
//         char ch='a';
//         float num=ch;  //type conversion not type casting. type conversion is possible for characters to int or float...
//         System.out.print(num);
//     }
// }


//type promotion
// public class TypeCasting{
//     public static void main(String args[]){
//         char a='a', b='b';
//         int c=b-a; // here b and a gets converted to int ie 98-97=1;
//         //char c=b-a; //ERROR : incompatible types: possible lossy conversion from int to char
//         System.out.print(c);
//     }
// }


public class TypeCasting{
    public static void main(String args[]){
        byte b=5;
        //b=b*2; //ERROR : incompatible types: possible lossy conversion from int to byte
        b=(byte)(b*2);
        System.out.print(b);
    }
}