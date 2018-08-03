import java.util.Scanner;
public class Middlelement {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String n=in.next();
		int l=n.length();
		if(l%2==0)
		{
			System.out.print(n.substring(0, l/2-1)+"**"+n.substring(l/2+1,l));
		}else
		System.out.print(n.substring(0, l/2)+"*"+n.substring(l/2+1,l));
	}
}
