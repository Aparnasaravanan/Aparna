import java.util.Scanner;

public class MaxPosbleNum {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,n,num;
		n=sc.nextInt();
		String s="";
		
		int[] a=new int[n];
		for(i=0;i<n;i++){
		a[i]=sc.nextInt();
		}
		int t;
		for(i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(a[i]>a[j]){
				t=a[i];
				a[i]=a[j];
				a[j]=t;
				}
			}
		}
		for(i=0;i<n;i++){
			s=s+a[i];
		}
		num=Integer.parseInt(s);
	System.out.println(num);
		
		
		
		
	}
}
