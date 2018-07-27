
import java.util.Scanner;
public class NumericharLine {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		String s=in.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
		char c=s.charAt(i);
		if(c>=48 && c<=57)
		{
			count++;
		}
	}
		System.out.print(count);
	}
}
