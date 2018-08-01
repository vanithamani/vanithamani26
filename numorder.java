
import java.util.Scanner;
public class numorder {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s=Integer.toString(n);
		for(int i=0;i<s.length();i++)
		System.out.print(" "+s.charAt(i));
		}
	}
