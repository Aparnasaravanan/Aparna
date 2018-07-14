import java.util.*;
public class Sum1 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,k,sum=0;
		n=sc.nextInt();
		int n1[]=new int[n];
		for(int i=0;i<n;i++){
			n1[i]=sc.nextInt();
			
		}
		k=sc.nextInt();
		for(int i=0;i<k;i++){
			sum=sum+n1[i];
		}
		System.out.println(sum);
		
	}

}
