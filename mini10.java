import java.util.Arrays;
import java.util.Scanner;
public class mini10 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n[]=new int[10];
		for(int i=0;i<10;i++)
		{ 
			n[i]=in.nextInt();
		}Arrays.sort(n);
         System.out.println(n[0]);
	}
}
