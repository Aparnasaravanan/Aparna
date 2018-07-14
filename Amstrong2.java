import java.util.Scanner;

public class Amstrong2 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,m,num,temp,a;
		n=sc.nextInt();
		m=sc.nextInt();
		for(int i=n+1;i<m;i++){
			a=0;
			num=i;
		while(num!=0){
			temp=num%10;
			a=a+temp*temp*temp;
			num=num/10;
		}
		if(a==i){
			System.out.println(i);
		}
		
		}
		}
}
