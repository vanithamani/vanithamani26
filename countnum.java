import java.util.Scanner;
public class countnum {
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			int n=in.nextInt();
			int n1,count=0;
			while(n!=0) {
				n1=n%10;
				count++;
				n=n/10;
			}
			System.out.println(count);
		}
	}
