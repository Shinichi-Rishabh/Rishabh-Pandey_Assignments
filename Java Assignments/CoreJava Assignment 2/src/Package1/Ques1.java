package Package1;
public class Ques1 {

	private static Ques1 obj;
	private Ques1() {
		System.out.println("This constructor prevents other classes to create an object of this class!");
	}
	public static Ques1 getInstance() {
		if(obj==null) {
			obj=new Ques1();
		}
		return obj;
	}
	
	

}
