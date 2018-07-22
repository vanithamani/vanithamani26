import java.util.Scanner;
public class Positive {
	public static void main(String[] args) {
	Scanner in=new Scanner (System.in);	
    int n=in.nextInt();
    if(n>1)
    System.out.print("positive");
    else if(n==0)
    System.out.print("zero");
    else
    System.out.println("negative");
    }
}
