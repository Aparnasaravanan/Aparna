import java.util.Scanner;

public class IndexValue {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,n,i,j,count=0;
		n=sc.nextInt();
		int ar[]=new int[n];
		for(i=0;i<n;i++){
			ar[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++){
			//System.out.println(ar[i]+"aa"+i);
			if(i==ar[i]){
				count++;
				System.out.print(ar[i]+" ");
			}
			
		}
		if(count==0){
			System.out.println("-1");
		}
	}

}
