package programs;

public class Kadanes {
	public static int kadane(int arr[]) {
		if(arr==null || arr.length==0) {
			return 0;
		}
		int currentMax=arr[0];
		int maxsum=arr[0];
		
		for (int i=0;i<arr.length;i++) {
			currentMax = Math.max(arr[i], currentMax+arr[i]);
			maxsum=Math.max(maxsum, currentMax);
		}
		return maxsum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(kadane(new int[] {-1,-2,-3,-4,-5}));
	}

}
