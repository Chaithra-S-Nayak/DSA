public class KadaneAlgorithm
{
    public static void maxSubarrays(int num[]){
        int max=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<num.length;i++){
            currsum=currsum+num[i];
            if(currsum<0){
                currsum=0;
            }
        }
        max=Math.max(max,currsum);
         System.out.println("max "+max);
}
	public static void main(String[] args) {
	     int num[] = {-2,3,4,-1,-2,1,5,-3};
	     maxSubarrays(num);
	}
}