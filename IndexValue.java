import java.util.Scanner;
public class IndexValue {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int n1[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	n1[i]=in.nextInt();
        }
        for(int j=0;j<n;j++)
        {
        System.out.println(n1[j]+"-"+j);
        }
	}
	}
