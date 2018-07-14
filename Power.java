import java.util.*;
public class Power {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,n,m,pow=1;
		n=sc.nextInt();
		m=sc.nextInt();
		for(i=0;i<m;i++){
			pow=pow*n;
		}
		System.out.println(pow);
	}

}
