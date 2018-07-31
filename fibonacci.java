import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int n1=1,n2=1,n3=0; 
        System.out.print(n1+" "+n2);
        for(int i=1;i<=n-2;i++)
        {
         n3=n1+n2;    
         System.out.print(" "+n3);    
         n1=n2;    
         n2=n3;    
        }
        }  
}  
