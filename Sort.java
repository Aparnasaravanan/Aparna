import java.util.Scanner;
public class Sort {
	public static void main(String[ ]args){
		Scanner sc=new Scanner(System.in);
		int n,i,j,min;
		n=sc.nextInt();
		int[] a=new int[n];
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		 }
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){	
			   if(a[i]<a[j]){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			   }
			}
       }
		for(i=0;i<n;i++){
		System.out.println(a[i]);;
		 }
	}

}
