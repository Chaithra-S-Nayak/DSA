//find the string with the largest ASCII value of the first character from an array of strings.
//my approach
public class LargestAsciiStringFinder{
	public static void main(String[] args) {
		String arr[]=new String[2];
		arr[0]="apple";
		arr[1]="banana";
		
		int maxascii=arr[0].charAt(0); //char type to int gives ascii
		String largestString=arr[0];
		for(int i=0;i<arr.length;i++){
		    if(maxascii<arr[i].charAt(0)){
		        maxascii=arr[i].charAt(0);
		        largestString=arr[i];
		    }
		}
        System.out.println(largestString);
	}
}