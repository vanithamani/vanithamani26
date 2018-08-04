import java.util.Scanner;
public class Numberexist {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int n1=in.nextInt();
	int num[]=new int[n];
	int i,count=0,temp=0;
	for( i=0;i<n;i++)
	{
		num[i]=in.nextInt();
	}
	for(int j=0;j<n;j++)
	{
	if(n1==num[j])
		count++;
	else
		temp++;
	}	
	if(count==1)
	    System.out.println("yes");
	else
		System.out.println("no");
	}
}
