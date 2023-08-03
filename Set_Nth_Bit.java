package Bitmasking;

public class Set_Nth_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=54;
		int k=2;
		System.out.println(setNthbit(n,k));

	}

	public static int setNthbit(int n, int k) {
		// TODO Auto-generated method stub
		int mask=(1<<k);
		return n|mask;
		
	}

}
