import java.util.*;
public class TwoDimArray
{
    public static void input(int matrix[][]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
    }

    public static void output(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void largestAndSmallest(int matrix[][]){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                min=Math.min(min,matrix[i][j]);
                max=Math.max(max,matrix[i][j]);
            }
        }
        System.out.println("max "+max);
        System.out.println("min "+min);
    }

	public static void main(String[] args) {
		int matrix[][]=new int[3][3];
        input(matrix);
        output(matrix);
        largestAndSmallest(matrix);
	}
}