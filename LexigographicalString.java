import java.util.Arrays;
import java.util.Scanner;
public class LexigographicalString {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String s1[]=s.split("");
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]);
		}
		Arrays.sort(s1);
		for(int i = 0; i <s1.length; i++) {
            System.out.println(s1[i]);
}
}
}
