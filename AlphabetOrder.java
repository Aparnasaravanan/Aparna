package prpfirst;
import java.util.Scanner;
public class AlphabetOrder {
	public static void main(String[] args){
		  char ch,ch1;
		Scanner in=new Scanner(System.in);
		System.out.println("The first character is");
	   ch=in.next().charAt(0);
	   System.out.println("The second character is");
		ch1=in.next().charAt(0);	
		if(ch<ch1){
			System.out.println(ch+""+ch1);
		}
		else{
			System.out.println(ch1+""+ch);
		}
		}
	   }


