import java.util.*;
public class occurance {

	public static void main(String[] x) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String s=sc.nextLine();
		int endIndex=0;
		int count=0;
		while(endIndex!= -1){
			endIndex=str.indexOf(s, endIndex);
			if(endIndex!= -1){
				count++;
				endIndex=str.length();
			}
		}
		System.out.println(count);
		
sc.close();
	}

}