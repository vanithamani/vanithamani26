import java.util.Scanner;
public class Numericalvalue {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>=48 && ch<=57)
			{
				System.out.print(ch);
			}
		}
	}
}
