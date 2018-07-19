import java.util.Scanner;

public class NumReverse {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,a,num=0;
		n=sc.nextInt();
		while(n!=0){
			a=n%10;
			num=num*10+a;
			n=n/10;
		}
		System.out.print(num);
		
	}

}
