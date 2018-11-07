package sortArray;
import java.util.Scanner;
public class Main {
	
 public static void main(String[] args) {
	 int[] arr1=getArray(4);
	 System.out.println("Initial array");
	 printArray(arr1);
	 int[] arr2=sortIntegers(arr1);
	 System.out.println("Sorted array");
	 printArray(arr2);
 }
 public static int[] getArray(int number) {
	 System.out.println("Enter numbers for array:");
	 Scanner sc=new Scanner(System.in);
	 int[] myArray=new int[number];
	 for (int i=0;i<number;i++) {
		 myArray[i]=sc.nextInt();
	 }
	 return myArray;
 }
 public static void printArray(int[] myArray) {
	 for (int i=0;i<myArray.length;i++) {
		 System.out.print(myArray[i]+" ");
	 }
 }
 public static int[] sortIntegers(int[] myArray) {
	 int[] newArray=new int[myArray.length];
	  newArray=myArray.clone();
	 for (int i=0;i<newArray.length;i++) 
		 for (int j=i+1;j<newArray.length;j++)
		 { int t=newArray[j];
			 if (newArray[i]<newArray[j])
			 {
				 newArray[j]=newArray[i];
				 newArray[i]=t;
			 }
			 //printArray(newArray
					// );
			 //System.out.println();
		 }
	 
	 return newArray;
 }
}
