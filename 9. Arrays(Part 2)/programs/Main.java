//Question 1: 
// public class Main
// {
//     public static boolean repeatElements(int num[]){
//         for(int i=0;i<num.length-1;i++){
//             for(int j=i+1;j<num.length;j++){
//             if (num[i]==num[j]){
//                 return true;
//             }
//         }
//         }
//         return false;
      
// }
// 	public static void main(String[] args) {
// 	     int num[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
// 	   boolean repeatElements=repeatElements(num);
// 	   System.out.print(repeatElements);
// 	}
// }


//Question 2: 
// public class Main
// {
//     public static int sastaBin(int num[],int target){
//         int i=0; int pivot=0;
//         while(i<num.length){
//             if(num[i]<num[i+1]){
//                 i++;
//             }else{
//                 pivot=i+1;
//                 break;
//             }
//         }
//         System.out.println("pivot "+pivot);
//         int start=0,end=num.length;
//         if(target==num[pivot]){
//             return pivot;
//         }
//         else if(target>num[pivot]&&target>num[0]){
//             end=pivot-1;
//         }else if(target>num[pivot]&&target<num[0]){
//             start=pivot+1;
//         }
//         while(start<=end){
//             int mid=(start+end)/2;
//             if(num[mid]==target){
//                 return mid;
//             }else if(num[mid]>target){
//                 end=mid-1;
//             }else{
//                 start=mid+1;
//             }
//         }
//         return -1;
//     }
// 	public static void main(String[] args) {
// 	    int num[] = {4,5,6,7,0,1,2};
// 	    System.out.println("index: "+sastaBin(num,2)); 
	  
// 	}
// }

//Question 3:  same stock Question 

//Question 4:  same trapwater Question 

//Question 5: didnt complete
public class Main{
    public static void triplets(int num[]){
        for(int i=0;i<num.length-2;i++){
            for(int j=1;j<num.length-1;j++){
                if(j==i){
                    continue;
                }
                for(int k=2;k<num.length;k++){
                    if(k==j||k==i){
                    continue;
                }
                    if(num[i]+num[j]+num[k]==0){
                        System.out.print("["+num[i]+","+num[j]+","+num[k]+"] ");
                    }
                }
            }
        }
    }
	public static void main(String[] args) {
	    int num[] = {-1, 0, 1, 2, -1, -4};
	  triplets(num); 
	  
	}
}