import java.util.Scanner;
public class addeven {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
         int n=in.nextInt();
         int n1=in.nextInt();
         int sum=n+n1;
         if(sum%2==0)
        	 
         {
        	 System.out.println("even");
         }else
        	 System.out.println("odd");
	}
}
