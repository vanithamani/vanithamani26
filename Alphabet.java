import java.util.Scanner;
public class Alphabet {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		char c= in.next().charAt(0);
		if((c>='a' && c<='z') || (c>='A' && c<='Z'))
		System.out.println("Alphabet");		
		else
			System.out.println("No ");
	}
}
