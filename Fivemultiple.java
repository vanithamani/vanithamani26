import java.util.Scanner;
public class Fivemultiple {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int n1=0;
		for(int i=1;i<=5;i++)
		{
			n1=n*i;
			System.out.print(n1+" ");
		}	
	}
}
