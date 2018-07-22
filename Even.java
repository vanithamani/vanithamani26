import java.util.Scanner;
public class Even {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n>=0)
		{
		if(n%2==0)
		System.out.print("even");
		else 
			System.out.print("odd");
		}
		else
			System.out.print("invalid");
	}
}
