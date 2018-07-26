import java.util.Scanner;
public class Numeric {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String n=in.nextLine();
		String n1="[0-9]+.[0-9+";
		if(n.matches(n1)) {
		System.out.println("yes");
	}else
		System.out.println("no");
}
}
