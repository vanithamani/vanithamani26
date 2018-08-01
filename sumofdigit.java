import java.util.Scanner;
public class sumofdigit {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum=0,n1;
		while(n!=0)
		{
			n1=n%10;
			sum=sum+n1;
			n=n/10;
		}
		System.out.println(sum);
	}
}
