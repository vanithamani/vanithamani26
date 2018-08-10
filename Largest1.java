import java.util.Arrays;
import java.util.Scanner;
public class Largest1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str="";
		int n=in.nextInt();
		int[] n1=new int[n];
		for(int i=0;i<n;i++) {
			n1[i]=in.nextInt();
		}
		Arrays.sort(n1);
		for(int i=0;i<n1.length;i++)
			str+=n1[i];
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		System.out.println(sb.toString());
	}
	}
