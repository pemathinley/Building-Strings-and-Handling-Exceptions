public class substrings {

	public static void main(String[] x) {
		String str="pema";
		for(int i=0; i<str.length(); i++){
			for(int j=i+1; j<=str.length(); j++){
				System.out.println(str.substring(i,j));
			}
		}

	}

}