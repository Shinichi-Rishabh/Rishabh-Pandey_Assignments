package Package1;

import java.util.*;

public class Ques3_Current extends Ques3_Bank {
	double tot=0;
	public void balance() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the balance: \t");
		bal = sc.nextDouble();
		sc.close();
	}
	public void cal() {
		double credit=20000;
		tot=bal+credit;
		System.out.println("Total : \t"+tot);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ques3_Current obj= new Ques3_Current();
		obj.balance();
		obj.cal();
	}

}
