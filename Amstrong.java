import java.util.*;
public class Amstrong {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,temp,a=0;
		n=sc.nextInt();
		int num=n;
		while(n!=0){
			temp=n%10;
			a=a+temp*temp*temp;
			n=n/10;
		}
		if(a==num){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
		
		
	}

}
