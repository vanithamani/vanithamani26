import java.util.Scanner;
public class multipleof7 {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		if(n%7==0)
		{
			System.out.println("yes");
		}else
		{
			System.out.println("no");
		}
	}
}
