package programs;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello Java";
		String s1="HelloJava";
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(6));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.substring(0,5));
		System.out.println(s.equals(s1));
		System.out.println(s1.indexOf("J"));
		System.out.println(s1+" Programming");
		System.out.println(s.replace("Hello", "Welcome"));
		System.out.println(s.replace("o","a"));
		System.out.println(s.isEmpty());
	}

}
