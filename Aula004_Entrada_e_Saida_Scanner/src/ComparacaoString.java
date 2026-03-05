
public class ComparacaoString {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "hello";
		
		if (str1.equals(str2)) System.out.println("É igual");
		
		else System.out.println("diff");
		
		if (str1.equalsIgnoreCase(str2)) System.out.println("É igual");
		
		else System.out.println("diff");
		
	}

}
