import java.util.*;
public class reversestring {

	public static void main(String[] x) {
		StringBuilder s=new StringBuilder("hello world");
		int l=s.length();
		int i;
		String rev="";
		System.out.println(s);
		for(i=l-1; i>=0; i--){
			rev=rev+s.charAt(i);
		}
		System.out.println("reversing: "+rev);
		
	}

}