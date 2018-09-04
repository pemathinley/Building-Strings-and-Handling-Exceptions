import java.util.Scanner;

public class numofwords {

	public static void main(String[] x) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] s=str.split("\\s+");
		System.out.println(s.length);
		
sc.close();
	}

}