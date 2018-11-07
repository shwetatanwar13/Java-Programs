package MinElementChallenge;
import java.util.Scanner;

public class Main {
 private static Scanner sc=new Scanner(System.in);
 public static void main(String []args) {
	System.out.println("Enter the number of elements in array");
	int count=sc.nextInt();
	int minNum=findMin(readIntegers(count));
	System.out.println("Finding the minimum number....");
	System.out.println("Minimum number in the array is:"+minNum);
	 
 }
public static int[] readIntegers(int count) {
	System.out.println("Enter "+count+" numbers:");
	int[] arr1=new int[count];
	for (int i=0;i<count;i++) {
	 arr1[i]=sc.nextInt();
	 sc.nextLine();
	}
 return arr1;
}
public static int findMin(int [] arr1) {
	int minNum=arr1[0];
	for(int i=1;i<arr1.length;i++){
		if(minNum>arr1[i]) {
			minNum=arr1[i];
			//System.out.println(minNum);
		}
	}
 return minNum;
}

}
