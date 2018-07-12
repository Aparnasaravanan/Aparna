import java.util.*;
public class AlphabetOrNot {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if((int)c>=65 && (int)c<=90 || (int)c>=97 && (int)c<=122){
			System.out.println("Alphabet");
		}
		else{
			System.out.println("No");
		}
	}

}
