public class Assignment{
    //Question:1
    // public static void countKey(int matrix[][],int key){
    //     //bruteforce
    //     int count=0;
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             if(matrix[i][j]==key){
    //                 count++;
    //             }
    //         }
    //     }
    //         System.out.println(count);
    //     }
	// public static void main(String[] args) {
	// 	int matrix[][]={ {4,7,8},
	// 	                {8,8,7} };
    //     int key=7;
	// 	countKey(matrix,key);
	// }

    //Question:2
    // public static void countKey(int matrix[][],int row){
    //     int sum=0;
    //         for(int j=0;j<matrix[0].length;j++){
    //             sum+=matrix[row][j];
    //             }
    //         System.out.println(sum);
    // }
	// public static void main(String[] args) {
	// 	int matrix[][]={ {1,4,9},
	// 	                {11,4,3},
	// 	                {2,2,3} };
	// 	int row=1;
	// 	countKey(matrix,row);
	// }

    //Question could only solve for n*n matrix using space complexity O(1), in the solution there is extra transpose matrix

    public static void transpose(int matrix[][]){
        for(int i=0;i<matrix.length-1;i++){
            for(int j=i;j<matrix[0].length;j++){
                if(i==j){
                    continue;
                }else{
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
    }
    public static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		int matrix[][]={ {1,4,9},
		                {11,4,3},
		                {2,2,3} };
		printMatrix(matrix);
		transpose(matrix);
		printMatrix(matrix);
	}
}