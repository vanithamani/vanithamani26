import java.util.Scanner;
public class EvenInterval {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int n1=in.nextInt();
		int n2=n+1;
		for(int i=n2;i<n1;i++)
		{
			if(i%2==0)	
		System.out.print(i+"");
		}
	}
}
