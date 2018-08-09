
import java.util.Scanner;
public class Specificvalue {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int n1=in.nextInt();
		int num[]=new int[n];
		int i,count=0;
		for( i=0;i<n;i++)
		{
			num[i]=in.nextInt();
		}
		System.out.println(num[n1-1]);
}
}
