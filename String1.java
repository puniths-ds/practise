package programs;
import java.util.Scanner;
public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence=sc.nextLine();
		int character=0;
		int word=0;
		int vowels=0;
		String lower=sentence.toLowerCase();
		for (int i=0;i<lower.length();i++) {
			char ch=lower.charAt(i);
			if (ch !=' '){
				character++;
			}
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			}
		}
		System.out.println("Characters are:"+character);
		System.out.println("Vowels are:"+vowels);
		System.out.println(sentence.substring(2)+lower);
		sc.close();
	}

}
