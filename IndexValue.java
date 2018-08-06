import java.util.Scanner;

public class IndexValue {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a,n,i,j,count=0;
		n=sc.nextInt();
		int l=Integer.toString(n).length();
		int ar[]=new int[l];
		i=l-1;
		while(n!=0){
			a=n%10;
			ar[i]=a;
			//System.out.println(ar[i]);
			n=n/10;
			i--;
		}
		
		
		for(i=0;i<l;i++){
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
