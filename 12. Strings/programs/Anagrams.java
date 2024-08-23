//not working
public class Anagrams{
	public static boolean anagrams(String str1,String str2) {
	    if(str1.length()!=str2.length()){
	        return false;
	    }
	    StringBuilder sb=new StringBuilder(str2);
	    int j=0;
		for(int i=0;i<str1.length();i++){
		    if(sb.length()==0){
		        return true;
		    }
		    if(j<str1.length() && str1.charAt(j)==sb.charAt(i)){
		        sb.deleteCharAt(i);
		        j++;
		    }
		}
		return false;
	}
	public static void main(String args[]){
	    String str1="race";
	    String str2="care";
	    System.out.println(anagrams(str1,str2));
	}
}