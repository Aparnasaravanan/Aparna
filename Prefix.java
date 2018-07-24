import java.util.*;
public class Prefix {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,l,j,n,max = 0,count=0
				;
		String c,c1,out="";
		n=sc.nextInt();
		String s[] =new String[n];
		for(i=0;i<n;i++){
		s[i]=sc.next();
		max=s[0].length();
		if(max>s[i].length()){
			max=s[i].length();
		}
		}
		for(i=1;i<=max;i++){
			count=0;
			for(j=1;j<s.length;j++){
				c1=s[0].substring(0, i);
			c=s[j].substring(0,i);
			//System.out.println(c+"c");
			if(c1.equals(c)){
			count++;	
			}
			}
			if(count==s.length-1){
				out=s[0].substring(0,i);
			}
		}
		System.out.println(out);
		
		
		
		
		
	}
}
