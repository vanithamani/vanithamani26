import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int n2=n;
		int temp=0,n1;
		while(n2>0)
		{
			n1=n2%10;
			temp=temp+(n1*n1*n1);
			n2=n2/10;
		}if(temp==n)
		{
			System.out.print("yes");
		}else
			System.out.print("no");
	}
}
