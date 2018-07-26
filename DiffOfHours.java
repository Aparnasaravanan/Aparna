import java.util.Scanner;

public class DiffOfHours {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	int i,h1,h2,m1,m2,a,b,sub,div,min;
h1=sc.nextInt();
h2=sc.nextInt();
m1=sc.nextInt();
m2=sc.nextInt();
	a=h1-h2;
	b=m1-m2;	
	System.out.println(a+" "+b);
}
}