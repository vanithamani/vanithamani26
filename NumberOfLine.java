import java.util.Scanner;
public class NumberOfLine {
	public static void main(String[] args) {
	Scanner in=new Scanner (System.in);
	String s=in.nextLine();
	String s1[]=s.split("\\.");
	int n=s1.length;
	System.out.print(n);
	}
}
