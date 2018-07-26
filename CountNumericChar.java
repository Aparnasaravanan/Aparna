import java.util.Scanner;

public class CountNumericChar {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i,count=0;
		String s=sc.nextLine();
		String[] a=s.split("\\.");
		for(i=0;i<a.length;i++){
			char[] c=a[i].toCharArray();
for(int j=0;j<a[i].length();j++){
if(Character.isDigit(c[j])){
	count++;
}
}
		}
			System.out.println(count);
	}

}
