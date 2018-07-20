import java.util.Scanner;

public class NumerIndex {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,n;
		n=sc.nextInt();
		int[] n1=new int[n];
		for(i=0;i<n;i++){
			n1[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			System.out.println(n1[i]+" "+i);
		}
		
	}

}
