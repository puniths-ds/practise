package programs;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="racecar";
		StringBuilder s1=new StringBuilder(s);
		String r=s1.reverse().toString();
		if(r.equals(s)) {
			System.out.println("It is palindrome");
			
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
