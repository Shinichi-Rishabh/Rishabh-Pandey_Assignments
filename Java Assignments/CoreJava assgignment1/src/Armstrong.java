import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number to check if it is Armstrong : \t");
		int arms=sc.nextInt();
		int check,rem,sum=0;
		check=arms;
		while(check!=0) {
			rem=check%10;
			sum = sum+(rem*rem*rem);
			check=check/10;
		}
		if(sum==arms) {
			System.out.println("Given number is an Armstrong number!");
		}
		else
			System.out.println("Given number is not an Armstrong number!");
		sc.close();
	}	
}
