import java.util.Scanner;
public class primenumber {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
			count++;
		} 
		}
		if(count==2)
			System.out.print("yes");
		else
			System.out.print("no");
	}
}
