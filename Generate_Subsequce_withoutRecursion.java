package Bitmasking;

public class Generate_Subsequce_withoutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		subsequence(str);
	}

	public static void subsequence(String str) {
		// TODO Auto-generated method stub
		for (int i = 0; i <1<< str.length(); i++) {
			printpattern(i,str);
		}
		
	}

	private static void printpattern(int i, String str) {
		// TODO Auto-generated method stub
		int pos=0;
			while(i!=0) {
				int mask=i&1;
				if(mask!=0) {
					System.out.print(str.charAt(pos));	
				}
				pos++;
				i>>=1;
			}
			System.out.println();
		}
	}


