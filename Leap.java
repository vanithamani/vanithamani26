import java.util.Scanner;
public class Leap {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(n%4==0)
		System.out.print("Yes");
		else
			System.out.print("No");
	}	
}
