import java.util.Scanner;
public class Number1_9inclusive {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n>=1 && n<=9)
		{
			System.out.println("yes");
		}else
			System.out.println("no");
	}
}
