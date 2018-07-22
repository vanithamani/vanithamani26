import java.util.Scanner;
public class Largest{
   public static void main(String args[])
   {
       int large, size;
       int a[] = new int[50];
       Scanner scan = new Scanner(System.in);
       size = scan.nextInt();
       for(int i=0; i<size; i++)
       {
           a[i] = scan.nextInt();
       }
       large = a[0];
       for(int i=0;i<size;i++)
       {
           if(large < a[i])
           {
               large = a[i];
           } 
       }
       System.out.print(large); 
   }
}
