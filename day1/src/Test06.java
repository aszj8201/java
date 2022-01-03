
public class Test06 {

	public static void main(String[] args) {
		int[][] star = new int[5][];
		star[0] = new int[1];
		star[1] = new int[2];
		star[2] = new int[3];
		star[3] = new int[4];
		star[4] = new int[5];
		
		for (int row = 0; row < star.length; row++) {
			for(int col = 0; col< star[row].length; col++) {
				
			}
		}
		for (int row = 0; row <= star.length; row++) {
			for (int col = 0; col < star[row].length; col++) {
				star[row][col] = '*';
				System.out.print((char)star[row][col]);
				
			}
			System.out.println();
			
		}
	}

}
