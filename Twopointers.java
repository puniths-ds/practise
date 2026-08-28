package programs;

public class Twopointers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,7,11,9};
		int left=0;
		int right=arr.length-1;
		
		while (left<right) {
			int temp=arr[left];  
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right--;
		}
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
