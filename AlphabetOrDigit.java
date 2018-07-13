package prpfirst;
import java.util.Scanner;
public class AlphabetOrDigit{
	  public static void main(String[] args){
		  char ch;
		  Scanner sc=new Scanner(System.in);
	            ch=sc.next().charAt(0);  
	        if(ch>='a' && ch<='z'){
	        	System.out.println("alphapets");
	        	}
	        	else if(ch>='0'&& ch<='9'){
	        		System.out.println("Number");
	        	}
	        	else{
	        		System.out.println("special character");
	        	}
	        
}
}
