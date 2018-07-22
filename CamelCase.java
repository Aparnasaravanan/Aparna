import java.util.Locale;
import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,l;
		String s,str1,s2;
		str1="";
	 s2=sc.nextLine();
	String[] s1=s2.split(" ");
	for(i=0;i<s1.length;i++){
	char c=s1[i].charAt(0);
	str1=str1+Character.toUpperCase(c);
	l=s1[i].length();
 s = s1[i].substring(1,l).toLowerCase();
str1=str1+s+" ";
	}

	System.out.println(str1);
	}

}
