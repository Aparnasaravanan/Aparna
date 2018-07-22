import java.util.Scanner;

public class DifferOneChar {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,j,c=0;
		String s,s1 ;
		s=sc.next();
		s1=sc.next();
		char c1,c2;
		for(i=0;i<s.length();i++){
		c1=s.charAt(i);
		c2=s1.charAt(i);
		if(c1!=c2){
			c++;
		}
		}if(c==1){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
	}

}
