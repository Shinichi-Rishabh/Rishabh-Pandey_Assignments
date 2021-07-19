package Package1;

public class Ques6_DatabasePersistence extends Ques6_Persistence{
	@Override
	void persist() {
		System.out.println("In Database Persistence");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques6_Persistence obj = new Ques6_DatabasePersistence();
		obj.persist();

	}

}
