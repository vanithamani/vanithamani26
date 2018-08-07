import java.util.Scanner;
public class Gcdof2_num {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        System.out.print(+gcd(n1,n2));
	}
	 static int  gcd(int n1,int n2)
	{
		if(n1==0||n2==0)
			return 0;
		if(n1==n2)
			return n1;
		if(n1>n2)
			return gcd(n1-n2,n2);
		else
			return gcd(n2,n2-n1);
}
}
