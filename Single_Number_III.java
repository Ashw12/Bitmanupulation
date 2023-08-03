package Bitmasking;

public class Single_Number_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,2,1,3,2,5};
		int[]k=singleNumbertwo(arr);
		for (int i = 0; i < k.length; i++) {
			System.out.print(k[i]+" ");
		}

	}

	public static int[] singleNumbertwo(int[] arr) {
		// TODO Auto-generated method stub
		int ans=0;
		int[] single=new int[2];
		for (int i = 0; i < arr.length; i++) {
			ans=ans^arr[i];
		}
		int mask=ans&(~(ans-1));
		int b=0;
		for (int i = 0; i < arr.length; i++) {
			if((arr[i]&mask)!=0)
			b=b^arr[i];
		}
		int a=b^ans;
		for (int i = 0; i < single.length; i++) {
				single[0]=b;
				single[1]=a;
		}
		return single;
		}
	}


