import java.util.Scanner;

public class StrReverse {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuffer s=new StringBuffer(str);
		s.reverse();
		System.out.println(s);
	}

}
