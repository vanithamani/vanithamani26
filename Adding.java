import java.util.Scanner;
public class Adding {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int n1[]=new int[n];
	int sum=0;
	for(int i=0;i<n;i++)
	{
		n1[i]=in.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		sum=sum+n1[i];
	}
	System.out.print(sum);
	}
}
