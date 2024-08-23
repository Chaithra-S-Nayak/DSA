public class StringPalindrome
{
    //my approach
    public static boolean palindrome(String str){
        int i=0;
        while(i<str.length()/2){
            if(str.charAt(i)==str.charAt(str.length()-1-i)){
                i++;
            }else{
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		String str="racecar";
		System.out.print(palindrome(str));
	}
}