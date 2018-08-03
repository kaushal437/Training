package LTI.BOOK;
public class string {
	public static void main(String[] args) {
		String s = "ad@gamil.commmm";
		if (s.indexOf('@') >= 4 && s.indexOf('.') >= 8
				&& (s.charAt(s.length() - 4) == '.' || s.charAt(s.length() - 3) == '.'))
			System.out.println("valid");
		else
			System.out.println("invalid");

	}
	
}
