import java.util.Scanner;
public class Areaofform {
	public static void main(String args[])
	{
		Scanner in=new Scanner (System.in);
		float len=in.nextFloat();
		float bre=in.nextFloat();
		float area=(len*bre);
		System.out.printf("%.5f",area);
	}
}
