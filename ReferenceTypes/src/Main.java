import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr1=new int[] {2,1,4,3};
    System.out.println(Arrays.toString(arr1));
    //Arrays.sort(arr1);
    System.out.println(Arrays.toString(arr1));
    int[] arr2=arr1;
    int[] arr3=arr2.clone();
    Arrays.sort(arr2);
    System.out.println("Array2"+Arrays.toString(arr2));
    System.out.println("Array1"+Arrays.toString(arr1));
    System.out.println("Array3"+Arrays.toString(arr3));
    System.out.println("Array2 address"+arr2);
    System.out.println("Array1 address"+arr1);
    System.out.println("Array3 address"+arr3);
    
	}

}
