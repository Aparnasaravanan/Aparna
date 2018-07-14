import java.util.*;
public class Palindrome {
	public static void main(String[] args){
Scanner sc=new Scanner(System.in);
		int n;
n=sc.nextInt();
		int temp;
		temp=n;
     int r=0;
     while(n!=0){
			int a;
			a=n%10;
			r=r*10+a;
			n=n/10;
     }
       if(temp==r){
    	   System.out.print("Yes");
     }
     else{
    	 System.out.print("No");
    
     }
       }
}
