import java.util.Scanner;
public class Palindrome1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        if(sb.toString().equals(s))
        {
        	System.out.print("yes");
        }
        else
        	System.out.print("no");
	}
}
