import java.util.Scanner;

public class Ques3 {

	public static void main(String[] args) {
		System.out.println("\nMenu:\n1) Simple Interest \n 2) Compound Interest\n Enter your choice (1/2):\t");
		Scanner sc =new Scanner(System.in);
		int i = sc.nextInt();
		char ch='n';
		do {
			
			switch(i) {
				case 1:{
						Simple();
						
						break;
					}
					
				case 2:{
						Compound();
						
						break;
				}
				default:{
						System.out.println("Error!! Enter again? (y/n) \t");
						ch=sc.next().charAt(0);
				}
			}	
		
		}while(ch=='y'||ch=='Y');
		sc.close();

	}
public static void Simple() {

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);

	    // take input from users
	    System.out.print("Enter the principal: ");
	    double principal = input.nextDouble();

	    System.out.print("Enter the rate: ");
	    double rate = input.nextDouble();

	    System.out.print("Enter the time: ");
	    double time = input.nextDouble();

	    double interest = (principal * time * rate) / 100;

	    System.out.println("Principal: " + principal);
	    System.out.println("Interest Rate: " + rate);
	    System.out.println("Time Duration: " + time);
	    System.out.println("Simple Interest: " + interest);

	    input.close();
	  
	
}

public static void Compound() {
	// create an object of Scanner class
    Scanner input = new Scanner(System.in);

    // take input from users
    System.out.print("Enter the principal: ");
    double principal = input.nextDouble();

    System.out.print("Enter the rate: ");
    double rate = input.nextDouble();

    System.out.print("Enter the time: ");
    double time = input.nextDouble();

    System.out.print("Enter number of times interest is compounded: ");
    int number = input.nextInt();

    double interest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;

    System.out.println("Principal: " + principal);
    System.out.println("Interest Rate: " + rate);
    System.out.println("Time Duration: " + time);
    System.out.println("Number of Time interest Compounded: " + number);
    System.out.println("Compound Interest: " + interest);
    input.close();
}

}
