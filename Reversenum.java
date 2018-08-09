import java.util.Scanner;
public class Reversenum {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		String s=String.valueOf(n);
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.println(sb.toString());
	}
}
