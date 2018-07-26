import java.util.Scanner;

public class NoOfSpaces {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.nextLine();
		String[] s1=s.split(" ");
		int n=s1.length-1;
		System.out.println(n);
	}

}
