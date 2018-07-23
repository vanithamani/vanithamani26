import java.util.Scanner;
public class ArmInterval {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);	
	int n=in.nextInt();
	int n1=in.nextInt();
    int a, b,  sum = 0;
for(int i = n; i < n1; i++)
{
    n = i;
    while(n > 0)
    {
        b = n % 10;
        sum = sum + (b * b * b);
        n = n / 10;
    }
    if(sum == i)
    {
        System.out.print(i+" ");
    }
    sum = 0;
}
}
}
