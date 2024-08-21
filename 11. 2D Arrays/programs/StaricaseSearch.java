public class StaricaseSearch
{
    public static boolean StaricaseSearch(int matrix[][],int key){
        //taking (0,m-1) as reference
        // int row=0,col=matrix[0].length-1;
        // while(row<matrix.length && col>=0){
        //     if(matrix[row][col]==key){
        //         System.out.println("key found at ("+row+","+col+")");
        //         return true;
        //     }else if(key>matrix[row][col]){
        //         row++;
        //     }else{
        //         col--;
        //     }
        // }

        //taking (n-1,0) as reference
        int row=matrix.length-1,col=0;
        while(col<matrix[0].length && row>=0){
            if(matrix[row][col]==key){
                System.out.println("key found at ("+row+","+col+")");
                return true;
            }else if(key<matrix[row][col]){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }
	public static void main(String[] args) {
		int matrix[][]={{10,20,30,40},
		               {15,25,35,45},
		               {27,29,37,48},
		               {32,33,39,50}};
		int key=33;
		StaricaseSearch(matrix,key);
	}
}