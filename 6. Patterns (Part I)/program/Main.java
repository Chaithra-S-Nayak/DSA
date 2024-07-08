public class Main
{
  public static void main (String[]args)
  { 
    //HOLLOW RECTANGLE pattern
    // char a='A';
	// for (int i = 1; i <= 4; i++)
	//   {
	// 	for (int j = 1; j <= 5; j++)
	// 	  {
	// 	      if(i==1||i==4||j==1||j==5){
	// 	          System.out.print ("*");
	// 	      }else{
	// 	          System.out.print (" ");
	// 	      }
	// 	  }
	// 	   System.out.println();
	//   }
	 
	//INVERTED & ROTATED HALF-PYRAMID pattern
	// for (int i = 1; i <= 4; i++)
	//   {
	// 	for (int j = 1; j <= 4; j++)
	// 	  {
	// 	      if(j<=4-i){
	// 	          System.out.print (" ");
	// 	      }else{
	// 	          System.out.print ("*");
	// 	      }
	// 	  }
	// 	   System.out.println();
	//   }
	 
//INVERTED HALF-PYRAMID with Numbers pattern
	//  int n = 5;
	// for (int i = 1; i <= 5; i++)
	//   {
	// 	for (int j = 1; j <= n - i + 1; j++)
	// 	  {
	// 		System.out.print (j);

	// 	  }
	// 	System.out.println ();
	//   }

//FLOYD'S Triangle pattern
// int n = 5;
// int num=1;
// 	for (int i = 1; i <= n; i++)
// 	  {
// 		for (int j = 1; j <= i; j++)
// 		  {
// 			System.out.print (" "+num+" ");
// 			num++;
// 		  }
// 		System.out.println ();
// 	  }

//0-1 Triangle pattern
// int n = 10;
// 	for (int i = 1; i <= n; i++)
// 	  {
// 		for (int j = 1; j <=i; j++)
// 		  {
// 			if(i%2==0 && j%2==0 || i%2!=0 && j%2!=0 ){
// 				System.out.print ("1");
// 			}else{
// 				System.out.print ("0");
// 			}

// 		  }
// 		System.out.println ();
// 	  }

//Butterfly Paatern
		// int n=8;
		// for(int i=1;i<=n;i++){
		//     for(int j=1;j<=n;j++){
		//     if((i-j>=0 && i+j<=(n+1)) || (i+j>=n+1 && j-i>=0)){
		//         System.out.print("*");
		//     }else{
		//         System.out.print(" ");
		//     }
		// }
		// System.out.print("\n");
		// }

//solid rhombus
// int n=5;
// 		for(int i=1;i<=n;i++){
// 		    for(int j=1;j<=2*n-1;j++){
// 		    if(i+j>=n+1 && i+j<=2*n){
// 		        System.out.print(" * ");
// 		    }else{
// 		        System.out.print(" ");
// 		    }
// 		}
// 		System.out.print("\n");
// 		}

//hollow rhombus
// int n=5;
// 		for(int i=1;i<=n;i++){
// 		    for(int j=1;j<=2*n-1;j++){
// 		    if(i+j==n+1 || i+j==2*n || (i==1 && j>=n) || (i==n && j<=n) ){
// 		        System.out.print("*");
// 		    }else{
// 		        System.out.print(" ");
// 		    }
// 		}
// 		System.out.print("\n");
// 		}

//diamond
// int n = 4;
// 	for (int i = 1; i <= n; i++){
// 		for (int j = 1; j <= n - i; j++){
// 			System.out.print (" ");
// 		  }
// 		for (int j = 1; j <= 2 * i - 1; j++){
// 			System.out.print ("*");
// 		  }
// 		System.out.print ("\n");
//     }
//     for (int i = n; i >= 1; i--){
// 		for (int j = 1; j <= n - i; j++){
// 			System.out.print (" ");
// 		  }
// 		for (int j = 1; j <= 2 * i - 1; j++){
// 			System.out.print ("*");
// 		  }
// 		System.out.print ("\n");
//     }

//number pyramind
// public static void numberPyramid(int n){
//     for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//     System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//     System.out.print(j+" ");
//     }
//     System.out.print("\n");
//     }
// }
// 	public static void main(String[] args) {
// 	 numberPyramid(5);
// 	}

//palindromePyramid
// public static void palindromePyramid(int n){
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//         }
//         for(int j=1;j<=2*i-1;j++){
//             int count=j;
//             if(count<=i){
//                 System.out.print(count);
//             }else{
//                 int diff=j-i;
//                 count=i-diff;
//                 System.out.print(count);
//             }
//         }
//         System.out.print("\n");
//     }
    
//     for(int i=n-1;i>=1;i--){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }
//         for(int j=1;j<=2*i-1;j++){
//             int count=j;
//             if(count<=i){
//                 System.out.print(count);
//             }else{
//                 int diff=j-i;
//                 count=i-diff;
//                 System.out.print(count);
//             }
        
//         }
//         System.out.print("\n");
//     }
// }
// 	public static void main(String[] args) {
// 	    palindromePyramid(4);
// 	}

  }
}
