import java.util.Scanner;
public class Numbetween {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
        int l=in.nextInt();
        int r=in.nextInt();
        if(n>l && n<r)
        {
        	System.out.println("yes");
        }else
        	System.out.println("no");
	}
}
