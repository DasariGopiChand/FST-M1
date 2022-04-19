

abstract class Book {

	String title;
	abstract void setTitle(String x);
	String getTitle() {
		return title;
	}
}

class MyBook extends Book {
	
	void setTitle(String x) {
		title = x;
		
	}
}
	
public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book boo = new MyBook();
		boo.setTitle("ItsMyBook");
		System.out.println(boo.getTitle());
		

	}

}
