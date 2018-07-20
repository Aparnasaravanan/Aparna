import java.util.Scanner;

public class Hours {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	int i,n;
	n=sc.nextInt();
	if(n<60){
		System.out.println("0"+" "+n);
	}
	else{
		int a=n/60;
		int b=n%60;
		System.out.println(a+" "+b);
	}
	}
	

}
