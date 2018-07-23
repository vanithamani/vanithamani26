import java.util.Scanner;
public class PrimeIntervals {
	public static void main(String[] args) {
	Scanner in =new Scanner (System.in);
	int n=in.nextInt();
	int n1=in.nextInt();
	int flag=0;
    for(int i=n;i<=n1;i++)
    {
    	for(int j=2;j<i;j++)
    	{
    		if(i%j==0)
    		{
    			flag=0;
    			break;
    		}else
    		{
    			flag=1;
    		}
    	}
    		if(flag==1)
    		{
    			System.out.print(i);
    		}
    	}}
    }
