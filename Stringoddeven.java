import java.util.Scanner;
public class Stringoddeven {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int len=s.length();
		String s1="",s2="";
		for(int i=0;i<len;i++) {
		if(i%2==0)
		{
		s1=s1+s.charAt(i);
		}
		else
		{
			s2=s2+s.charAt(i);
		}
		}
		System.out.println(s1);
		System.out.println(s2);
	}
}
