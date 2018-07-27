import java.util.Scanner;
public class WordCount {
		public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int sum=0;
		String s1[]=s.split("\\s");
		int n=s1.length;
		 sum=sum+n;	
		System.out.println(sum);
		}
	}
