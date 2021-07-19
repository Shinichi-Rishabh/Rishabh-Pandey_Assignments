package Package1;

import java.util.Scanner;

public class Ques2_Labour extends Ques2_Employee {

	double ovrt;
	int hrs;
	public void calc() {
		Scanner sc =new Scanner(System.in);
		double tot;
		System.out.println("Enter the overtime rate of labour : \t");
		ovrt=sc.nextDouble();
		System.out.println("Enter the number overtime hours of labour : \t");
		hrs=sc.nextInt();
		tot=(ovrt*hrs)+salary;
		System.out.println("Salary of a labour2 : \t"+tot);
		sc.close();
	}
	public static void main(String[] args) {
		Ques2_Labour obj = new Ques2_Labour();
		obj.calc();
	}

}
