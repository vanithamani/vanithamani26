import java.util.Scanner;
public class Numroundof {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		float num=in.nextFloat();
		int num1=Math.round(num);
		System.out.println(num1+1);
	}
}
