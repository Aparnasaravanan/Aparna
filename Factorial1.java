import java.util.Scanner;
public class Factorial1 {
	public static void main(String[] args){
		 Scanner sc=new Scanner(System.in);
		 int n,i,fact=1;
		 n=sc.nextInt();
		 for(i=1;i<n;i++){
			 fact=fact+fact*i;
		 }
		 System.out.println(fact);
	}
}
