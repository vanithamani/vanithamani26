import java.util.Scanner;
public class Multipleof13 {
	public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     if(n%13==0)
     {
    	 System.out.println("yes");
     }else
    	 System.out.println("no");
	}
}
