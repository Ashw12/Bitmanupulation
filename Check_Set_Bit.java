package Bitmasking;

public class Check_Set_Bit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n=56;
           System.out.println(Countsetbit(n));
           
	}

	public static int Countsetbit(int n) {
		// TODO Auto-generated method stub
		int count=0;
		while(n!=0) {
			if((n&1)!=0) {
				count++;
			}
			n>>=1;
		}
		return count;
	}

}
