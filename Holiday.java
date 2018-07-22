import java.util.Scanner;

public class Holiday {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.next();
		if(s.equalsIgnoreCase("Saturday") || s.equalsIgnoreCase("Sunday") ){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}

}
