package prpfirst;
import java.util.Scanner;
public class PrintValues {
	 public static void main(String[]args){
	 if(args.length==0){
	 
		  System.out.println("the no value");
	 }
	 else{
		 for (int i=0;i<args.length;i++){
		 System.out.print(args[i]);
		 if(i<args.length-1){
		 System.out.print(",");
         }
		 }

    }
  }
}