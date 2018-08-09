import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int p=in.nextInt(); 
    int n=in.nextInt();
    int r=in.nextInt();
    System.out.println((p*n*r)/100);
	}
