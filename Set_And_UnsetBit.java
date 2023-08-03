package Bitmasking;

public class Set_And_UnsetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int pos=2;
		System.out.println(setbit(n,pos));

	}

	public static boolean setbit(int n, int pos) {
		// TODO Auto-generated method stub
		n>>=pos;
		if((n&1)==0) {
			return true;
		}else {
			return false;
		}
	}

}
