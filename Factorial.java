import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
				int fact=1,n,i;
				Scanner ab=new Scanner(System.in);
				n=ab.nextInt();
				for(i=1;i<=n;i++) {
					fact=fact*i;
				}
					System.out.print(fact);
				}
			}
