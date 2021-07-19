package Package1;
import java.util.*;
public class Ques3_Saving extends Ques3_Bank{

	double tot=0;
public void balance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the balance: \t");
		bal=sc.nextDouble();
		sc.close();
		
	}
	public void cal() {
		double fd =200000;
		tot=bal+fd;
		System.out.println("Total : \t"+tot);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ques3_Saving obj= new Ques3_Saving();
		obj.balance();
		obj.cal();
	}

}
