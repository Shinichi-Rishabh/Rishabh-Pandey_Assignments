import java.util.Scanner;
public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub1,sub2,sub3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of first subject :\t");
		sub1=sc.nextInt();
		System.out.println("Enter marks of second subject :\t");
		sub2=sc.nextInt();
		System.out.println("Enter marks of third subject :\t");
		sub3=sc.nextInt();
		if (sub1>60 && sub2>60 && sub3>60)
			System.out.println("Passed");
		else if ((sub1>60 && sub2>60) || (sub2>60 && sub3>60) || (sub3>60 && sub1>60))
			System.out.println("Promoted");
		else
			System.out.println("Failed");
		
		sc.close();
		
	}

}
