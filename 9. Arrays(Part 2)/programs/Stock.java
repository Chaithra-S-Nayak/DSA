public class Stock
{
    public static int stock(int num[]){
        int bp=num[0]; int sp=0;
        int bpday=0,spday=0;
        int maxProfit=0;
        int profit[]=new int[num.length];
        for(int i=0;i<num.length;i++){
            if(bp>num[i]){
                bp=num[i];
               bpday=i+1; 
            }
            
            profit[i]=num[i]-bp;
        }
        for(int i=0;i<num.length;i++){
            System.out.println(profit[i]);
            if(maxProfit<profit[i]){
                maxProfit=profit[i];
                sp=num[i];
                spday=i+1;
            }
          
        }
        System.out.println("bp "+bp);
        System.out.println("sp "+sp);
        System.out.println("bpday "+bpday);
        System.out.println("spday "+spday);
        return maxProfit;
      
}
	public static void main(String[] args) {
	     int num[] = {7,1,5,3,6,4};
	     int maxProfit=stock(num);
	     System.out.println("maxProfit "+maxProfit);
	}
}