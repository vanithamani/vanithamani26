import java.util.Scanner;
public class Maximum {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int n1[]=new int[n];
		int max=0;
		for(int i=0;i<n;i++)
		{
			n1[i]=in.nextInt();
		}
		max=n1[0];
		for(int i=0;i<n;i++){
			if(max<n1[i])
			{
				max=n1[i];
			}
		}
		System.out.print(max);
	}
}
