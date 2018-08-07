import java.util.Scanner;
public class Lcmof2_num {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n1=in.nextInt();
	int n2=in.nextInt();
	int lcm=0;
	lcm=(n1>n2)? n1:n2;
	while(true){
		if(lcm%n1==0 && lcm%n2==0) {
			System.out.println(lcm);
			break;
		}
		lcm++;
	}
	}
}
