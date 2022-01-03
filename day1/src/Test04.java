
public class Test04 {
	
	public static void main(String[] args) {
		int a,b,c;
		a=10;
		b=20;
		c=30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		int[] array;
		array = new int[3];
		
		for(int i=0; i<array.length; i++) {
			array[i] = 10 + 10*i;
		}
		
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		
		for(int i=0;i<10;i++) {
			//¹®Àå
		}
		//System.out.println(array[0]);
		//System.out.println(array[1]);
		//System.out.println(array[2]);
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
