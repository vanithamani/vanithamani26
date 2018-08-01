import java.util.Scanner;
public class Productevenodd {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int n1=in.nextInt();
		int product;
        product=n*n1;
        if(product%2==0) {
        	System.out.println("even");
        }else
        	System.out.println("odd");
	}
}
