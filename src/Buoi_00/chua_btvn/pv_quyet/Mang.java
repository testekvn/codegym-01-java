package Buoi_00.chua_btvn.pv_quyet;

public class Mang{
	public static void main(String args[]) {
		int[] arr = {2,7,6,8,9,21,34,56,32,12,37};
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if ( max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.print("Phan tu lon nhat la: " + max);
		//System.out.print("Tong 2 so dau cuoi trong mang la: " + Sum);
	}
}