package programs;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {50,10,20,30,40};
		boolean isAscending=true;
		for (int i=0;i<arr.length-1;i++) {
			if (arr[i]>arr[i+1]) {
				isAscending=false;
				break;
			}
		}
		if (isAscending) {
			System.out.println("Array is sorted");
		}else {
			System.out.println("Not sorted"); 
		}
	} 
}