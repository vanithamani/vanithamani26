import java.util.Scanner;
public class Minimum {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int []n1=new int[n];
	int min=0;
	for(int i=0;i<n;i++)
	{
		 n1[i]=in.nextInt();
	}
	min=n1[0];
    for(int i=0;i<n;i++)
    {
    	if(min>n1[i])
    	{
    	 min=n1[i];	
    	}
    }
    System.out.print(min);
	}
}
