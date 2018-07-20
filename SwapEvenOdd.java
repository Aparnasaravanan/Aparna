import java.util.Scanner;

public class SwapEvenOdd {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s,s1="";
		s=sc.next();
		int i=0;
		char c[]=new char[s.length()];
		for(i=0;i<s.length();i++){
			int n=i+1;
		
 	if(n%2==0){
 		c[i]=s.charAt(i-1);
 	}
 	else{
 		c[i]=s.charAt(i+1);
 	}
	}
		for(i=0;i<s.length();i++){
			System.out.print(c[i]);
		}
	}
}
