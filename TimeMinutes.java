import java.util.Scanner;
public class TimeMinutes {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
	    int n1=n/60;
	    int n2=n%60;
	    System.out.println(n1+" "+n2);
	}
}
