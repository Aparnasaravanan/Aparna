import java.util.Scanner;
public class MedianElement {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n,i,j,temp;
		n=sc.nextInt();
		int[] arr=new int[n];
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++){
			for(j=1;j<n;j++){
		if(arr[i]<arr[j]){
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;	
		}
			}
		}System.out.println(arr[n/2+1]);
}
}

