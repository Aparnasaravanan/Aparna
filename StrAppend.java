
import java.util.Scanner;
public class StrAppend {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		StringBuffer s=new StringBuffer(str);
		s.append(".");
		System.out.println(s);	
	}

}
