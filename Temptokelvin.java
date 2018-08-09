import java.util.Scanner;
public class Temptokelvin {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	 int temp=in.nextInt();
	 float kelvin=273.15f;
	 kelvin=kelvin+temp;
	 System.out.println(kelvin);
	}
}
