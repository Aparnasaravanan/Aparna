import java.util.*;
public class NoOfDigits {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,count=0;
		n=sc.nextInt();
		while(n!=0){
			int a=n%10;
			count++;
			n=n/10;
		}
	System.out.println(count);
	}
}
