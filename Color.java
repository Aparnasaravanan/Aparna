package prpfirst;
import java.util.*;
public class Color {
		public static void main(String[] args){
			Scanner sc= new Scanner(System.in);
			char c=sc.next().charAt(0);
			switch(c){
			case 'R':
				System.out.print("Red");
				break;
			case 'Y':
				System.out.print("Yellow");
			break;
			case 'B':
				System.out.print("Blue");
				break;
			case 'W':
				System.out.print("White");
			break;
			case 'G':
				System.out.print("Green");
				break;
			case 'O':
				System.out.print("Orange");
			break;
			default:
				System.out.print("Invalid");
			}
		}

	}

