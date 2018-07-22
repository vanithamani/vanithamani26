import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		  int a[] = new int[50];
	       Scanner in = new Scanner(System.in);
	       int n= in.nextInt();
	       int n1=in.nextInt();
	       int sum=0;
	       for(int i=0;i<n;i++)
	       {
	    	   a[i]=in.nextInt();
	       }
	       for(int j=0;j<n1;j++)
	       {
	    	sum=sum+a[j];   
	       }
System.out.print(sum);
	}
}
