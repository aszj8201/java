
public class Test05 {

	public static void main(String[] args) {
		int[][] arr = new int [3][4];
		
		int x = 1;
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[row].length; col++) {
				// 값 할당 출력
				arr[row][col] = x ;
				x++;
			}
		}
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+"\t");
				
			}
			System.out.println();
			
		}
		/* 1  2  3  4
		 * 5  6  7  8
		 * 9 10 11 12
		 */
		/* 00 01 02 03
		 * 10 11 12 13
		 * 20 21 22 23
		 */
	}

}
