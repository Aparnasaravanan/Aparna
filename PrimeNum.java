
import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,j,l,r;
		l=sc.nextInt();
		r=sc.nextInt();
		for(i=l+1;i<r;i++){
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


