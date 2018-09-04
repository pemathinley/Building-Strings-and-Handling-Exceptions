import java.util.*;
public class removevowel {

	public static void main(String[] x) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str=s.replaceAll("[aeiouAEIOU]","");
		System.out.println(str);
		sc.close();
	}

}