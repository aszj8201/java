import day1.pack.BookDTO;

public class Test02 {

	public static void main(String[] args) {
		BookDTO b = new BookDTO();
		
		
		b.title = "수평으로 함께 잠겨보려고";
		b.price = 9000;
		b.company = "창비";
		b.page = 100;
		
		System.out.println(b.title+"\t");
		System.out.println(b.price+"\t");
		System.out.println(b.company+"\t");
		System.out.println(b.page);
	}

}
