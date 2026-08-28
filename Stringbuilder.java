package programs;

public class Stringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder SB= new StringBuilder("Hello");
		SB.append("programming");
		System.out.println(SB);
		System.out.println(SB.insert(5, "Java"));
		System.out.println(SB.delete(5, 9));
		System.out.println(SB.reverse());
		System.out.println(SB.length());
	}

}
