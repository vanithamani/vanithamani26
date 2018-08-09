import java.util.Scanner;
public class Apsum {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int d=in.nextInt();
		int n=in.nextInt();
		int ap=2*a+(n-1)*d;
		 System.out.println(n/2*ap);
	}
}
