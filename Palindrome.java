import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int n1=n;
        int temp=0,a=0;
        while(n>0)
        {
        	a=n%10;
        	temp=temp*10+a;
        	n=n/10;
        }
        if(temp==n1)
        	System.out.print("yes");
        else
        	System.out.print("no");
	}
}
