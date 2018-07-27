import java.util.Scanner;
public class countCharacter {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s=in.nextLine();
	int sum=0;
	String s1[]=s.split("\\s");
	for(int i=0;i<s1.length;i++)
	{
	     int n=s1[i].length();
	     sum=sum+n;	
	}System.out.println(sum);
	}
}
