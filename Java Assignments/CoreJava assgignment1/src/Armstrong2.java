
public class Armstrong2 {

	public static void main(String[] args) {
		System.out.println("This program prints all Armstrong numbers from 100-999");
		int i,check,rem,sum=0;
		for(i=100;i<1000;i++) {
			check=i;
			while(check>0) {
				rem=check%10;
				sum=sum+(rem*rem*rem);
				check=check/10;
			}
			if(sum==i) {
				System.out.println(i);
			}
			sum=0;
		}
		

	}

}
