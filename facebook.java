package sama_tasks;

public class facebook {
	private int id;
	private String text;
	private String image;
	facebook(int id, String text,String image){
		this.id=id;
		this.image=image;
		this.text=text;
		 System.out.println("Iam in facebook");
	}
	
	void print() {
		 System.out.println("id: "+id);
		 System.out.println("text: "+text);
		 System.out.println("image: "+image);
	}
}
