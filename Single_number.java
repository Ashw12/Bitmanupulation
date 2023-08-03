package Bitmasking;

public class Single_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,1,3,2,5};
		System.out.println(Singlebit(arr));
	}

	public static int Singlebit(int[] arr) {
		// TODO Auto-generated method stub
		int ans=0;
		for (int i = 0; i < arr.length; i++) {
			ans=ans^arr[i];
		}
		return ans;
	}

}
