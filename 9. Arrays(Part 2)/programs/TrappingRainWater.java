import java.util.*;
public class TrappingRainWater
{
    public static void rainWater(int num[]){
        int rMax[]=new int[num.length];
        int lMax[]=new int[num.length];
        rMax[num.length-1]=num[num.length-1];
        lMax[0]=num[0];
        for(int i=1;i<num.length;i++){
            lMax[i]=Math.max(num[i],lMax[i-1]);
        }
        for(int i=num.length-2;i>=0;i--){
            rMax[i]=Math.max(num[i],rMax[i+1]);
        }
        // for(int i=0;i<num.length;i++){
        //   System.out.print(lMax[i]+"    ");
        //   System.out.println(rMax[i]);
        // }
        int volume=0;
        for(int i=0;i<num.length;i++){
            int waterLine=Math.min(lMax[i],rMax[i]);
            volume+=waterLine-num[i];
       
        }
        System.out.println(volume);
}
	public static void main(String[] args) {
	     int num[] = {4, 2, 0, 3, 2, 5};
	     rainWater(num);
	}
}