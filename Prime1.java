import java.util.*;
public class Prime1 {
 public static void main(String[] args){
	 Scanner sc=new Scanner(System.in);
	 int i,j,count=0;
	 int n;
	 n=sc.nextInt();
	 for(i=1;i<=n;i++){
		 if(n%i==0){
			 count++;
		 }
	 }
		 if(count<=2){
			 System.out.print("prime number");
		 }
		 else{
			 System.out.print("Not a prime number");
		 }
	 
 }
}
