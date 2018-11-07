import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr1= {1,5,3,7,11,9,15};
     System.out.println(Arrays.toString(arr1));
     System.out.println("After reversing...");
     reverse(arr1);
     System.out.println(Arrays.toString(arr1));
	}
	public static void reverse(int[] myArray) {
		// TODO Auto-generated method stub
      int j=myArray.length/2;
      int temp=0;
      for (int i=0;i<j;i++) {
    	  temp=myArray[i];
    	  myArray[i]=myArray[myArray.length-1-i];
    	  myArray[myArray.length-1-i]=temp;
      }
	}
}
