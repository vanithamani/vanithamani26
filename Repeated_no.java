import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Repeated_no {
	public static void main(String[] args) {
	 Scanner in=new Scanner(System.in);
	 int n1=in.nextInt();
	 int n2[]=new int[n1];
	 int count=0,temp=0;
	 ArrayList<Integer> ar=new ArrayList<Integer>();
	 for(int i=0;i<n2.length;i++)
	 {
		 n2[i]=in.nextInt();
	 }
	 for(int i=0;i<n2.length-1;i++) {
		 for(int j=i+1;j<n2.length;j++) {
		 if(n2[i]==n2[j]) {
			 count++;
			 temp=n2[j];
			ar.add(temp);
			Collections.sort(ar);	
		 }
		 }
	 }if(count>=1) {
	 System.out.println(ar);	
	 }else
		 System.out.println("unique");
}
}
