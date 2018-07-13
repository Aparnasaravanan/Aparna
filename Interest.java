package prpfirst;
import java.util.Scanner;
public class Interest {
		public static void main(String[] args){
			int age=Integer.parseInt(args[1]);
			if(args[0].equals("male")){
				
				if(age>=1 && age<=60){
					System.out.print("9.2%");
					if(age>=61 && age<=122){
						System.out.print("8.3%");
						
						
					}
					}
				}
				
				else{
	                 if(age>=1 && age<=58){
	                	 System.out.print("8.2%");
	                 }
	                 if(age>=59 && age<=122){
	                	 System.out.print("7.6%");
	                 }
				
				}
		}

	}

