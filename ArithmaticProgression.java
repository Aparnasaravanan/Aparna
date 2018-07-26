import java.util.*;
public class ArithmaticProgression {
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n,a,d,i,sum=0;
	n=sc.nextInt();
	a=sc.nextInt();
	d=sc.nextInt();
	for(i=n;i>=1;i--){
		sum=sum+(a+(i-1)*d);	
	}
	System.out.println(sum);
	}

}
