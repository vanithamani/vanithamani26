import java.lang.reflect.Array;
import java.util.Scanner;
public class Sorting {
	public static void main(String[] args) {
		Scanner ab=new Scanner(System.in);
		int n=ab.nextInt();
		int n1[]=new int[n];
		int min[]=new int[n];
		int temp=0;
		for(int i=0;i<n;i++)
		{
		n1[i]=ab.nextInt();
		}
	    for(int i=0;i<n-1;i++)
	    {
	    	for(int j=i+1;j<n-1;j++)
	    	{
	    		if(n1[i]>n1[j])
	    		{
	    			temp=n1[i];
	    			n1[i]=n1[j];
	    			n1[j]=temp;
	    		}
	    	}
	    }
	    for(int i=0;i<n-1;i++) {
	    System.out.print(n1[i]+" ");
		}
	    System.out.print(n1[n-1]);
		}
}
