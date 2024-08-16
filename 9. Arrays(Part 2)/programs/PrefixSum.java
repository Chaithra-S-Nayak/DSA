import java.util.*;
public class PrefixSum
{
    public static void maxSubarrays(int num[]){
        //prefix Array
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<num.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        int max=Integer.MIN_VALUE;
        int currsum=0;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
            currsum= i==0?prefix[j] : prefix[j]-prefix[i-1];
        }
        if(currsum>max){
            max=currsum;
        }
        }
        System.out.println("max "+max);
    }
	public static void main(String[] args) {
	     int num[] = {1, -2, 6, -1, 3};
	     maxSubarrays(num);
	}
}