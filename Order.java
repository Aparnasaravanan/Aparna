package prpfirst;
import java.util.Scanner;
public class Order {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
			char c1,c2;
			c1=sc.next().charAt(0);
			c2=sc.next().charAt(0);
		if(c1>c2){
			System.out.print(c2+","+c1);
		}
		else{
		System.out.print(c1+","+c2);
		}
		}

	}


