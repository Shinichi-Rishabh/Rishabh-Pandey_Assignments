package Package1;
import java.util.*;
public class Ques2_Manager extends Ques2_Employee {

	double incentive;
	public void calc() {
		Scanner sc =new Scanner(System.in);
		double tot;
		System.out.println("Enter the incentive of manager : \t");
		incentive=sc.nextDouble();
		tot=incentive+salary;
		System.out.println("Salary of a manager : \t"+tot);
		sc.close();
	}
	public static void main(String[] args) {
		
		Ques2_Manager obj = new Ques2_Manager();
		obj.calc();
		

	}

}
