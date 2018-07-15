import java.util.*;
public class MaxEle {
	public static void main(String[ ]args){
		Scanner sc=new Scanner(System.in);
		int n,i,max=0;
		n=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
	
			if(max<a[i]){
				max=a[i];
			}
		}
		System.out.println(max);
		
	}

}
