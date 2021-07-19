package Package1;

public class Ques6_FilePersistence extends Ques6_Persistence{
	@Override
	void persist() {
		System.out.println("In File Persistence");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques6_Persistence obj = new Ques6_FilePersistence();
		obj.persist();

	}

}
