import java.util.Scanner;
public class SwappingBitwise {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num1=in.nextInt();
		int num2=in.nextInt();
		num1=num1^num2;
		num2=num1^num2;
		num1=num2^num1;
		System.out.println(num1+" "+num2);
	}
}
