import java.util.Scanner;
public class Prime {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,j;
		int n=sc.nextInt();
		int m=sc.nextInt();
		for(i=n+1;i<m;i++){
			int count=0;
			for(j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
				if(count==2){
				System.out.println(i);
			}
		}
	}

}
