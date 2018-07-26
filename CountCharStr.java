import java.util.Scanner;
public class CountCharStr {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int j,i,n=0;
		String s=sc.nextLine();
		String[] str=s.split(" ");
		for(i=0;i<str.length;i++){
			n=n+str[i].length();
		}
		System.out.println(n);
	}

}
