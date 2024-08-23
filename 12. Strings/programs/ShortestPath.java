import java.util.*;
public class ShortestPath{
    //my approach
    public static double shortestPath(String str){
        //get coordinates
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char c= str.charAt(i);
            if(c=='W'){
                x--;
            }else if(c=='E'){
                x++;
            }else if(c=='S'){
                y--;
            }else if(c=='N'){
                y++;
            }else{
                System.out.println("Invalid direction!");
            }
        }
        System.out.println(x+" "+y);
        
        double shortPath=Math.sqrt(x*x+y*y);
        return shortPath;
    }
	public static void main(String[] args) {
		String str="WNEENESENNN";
		System.out.println("Shortest path "+shortestPath(str));
	}
}