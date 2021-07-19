import java.util.*;
public class Ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tax=0,ctc;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter income: \t");
		ctc=sc.nextDouble();
		if(ctc<=180000) {
			System.out.println("Income tax = "+tax);
		}
		else if(ctc>180000 && ctc<=300000) {
			tax=0.1*ctc;
			System.out.println("Income tax = "+tax);
		}
		else if(ctc>300000 && ctc <= 500000) {
			tax=0.2*ctc;
			System.out.println("Income tax = "+tax);
		}
		else {
			tax=0.3*ctc;
			System.out.println("Income tax = "+tax);
		}
		sc.close();
	}

}
