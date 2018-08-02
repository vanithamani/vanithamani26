import java.util.Scanner;
public class Diffevenodd {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int n1=in.nextInt();
        int diff=n-n1;
        if(diff%2==0)
        System.out.print("even");
        else
        	System.out.print("odd");
	}
}
