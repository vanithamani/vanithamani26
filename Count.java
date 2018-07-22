import java.util.Scanner;
public class Count {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String n1=Integer.toString(n);
		int count=0;
		for(int i=0;i<n1.length();i++)
		{
			count++;
		}
		System.out.print(count);
	}
}
