import java.util.Scanner;

public class RepeatNum {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,j,n,k=0,count=0,c1=0;
		n=sc.nextInt();
		int a[]=new int[n];
		int[] b=new int[20];
	for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	for(i=0;i<n;i++){
		count=0;
		for(j=0;j<=i;j++){
			if(a[i]==a[j]){
				count++;	
			}
		}
		if(count==1){
			b[k]=a[i];
		//	System.out.println(b[k]);
			k++;
		}
	}
	for(i=0;i<b.length;i++){
		count=0;
		for(j=0;j<n;j++){
			if(b[i]==a[j]){
				count++;	
			}
		}
		if(count>1){
			//b[k]=a[i];
			System.out.println(b[i]);
			
		}
	}
	
	}
}
