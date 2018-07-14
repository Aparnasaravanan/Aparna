import java.util.Scanner;

public class Multiple {
	public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
		 int n,i=0,mul;
		 n=sc.nextInt();
		  mul=n;
		 while(i<5){
			 System.out.print(mul+" ");
			mul=mul+n; 
			i++;
		 }

	}
}
