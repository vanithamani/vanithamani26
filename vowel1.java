import java.util.Scanner;
public class vowel1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char c= in.next().charAt(0);
		if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
			System.out.println("yes");
		else
			System.out.println("No");
	}
}
