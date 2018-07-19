import java.util.*;
public class RomanToInteger {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,i,j,rom=0,n1 = 0;
		String s1;
		s1=sc.next();
		char[] c1=s1.toCharArray();
		int[] c=new int[c1.length];
		for(j=0;j<s1.length();j++){
			System.out.println(c1[j]);
		if(c1[j]=='I'){
					c[j]=1;
	           	}
		if(c1[j]=='V'){
					c[j]=5;
				}
		if(c1[j]=='X'){
					c[j]=10;
                }

		if(c1[j]=='L'){
					c[j]=50;
				}
		if(c1[j]== 'C'){
					c[j]=100;
					}
	         
		if(c1[j]== 'D'){
					c[j]=500;
				}
		if(c1[j]=='M'){
					c[j]=1000;
		}
				}
		for(i=0;i<c.length;i++){
			if(i+1<c.length){
			if(c[i]==c[i+1]){
				rom=rom+c[i];
				
				i++;
			}
			 if(c[i]<c[i+1]){
				rom=rom+c[i+1]-c[i];
				i++;
			}
			else{
				rom=rom+c[i]+c[i+1];
				i++;
			}		
		}
			
		}	
		System.out.println(rom);
	}
}