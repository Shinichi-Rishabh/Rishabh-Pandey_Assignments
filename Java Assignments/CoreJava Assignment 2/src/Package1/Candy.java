package Package1;
import java.util.*;
public class Candy extends DesertShop {
	ArrayList<String> candy=new ArrayList<String>();
	ArrayList<Double> price=new ArrayList<Double>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candy obj=new Candy();
		Scanner a = new Scanner(System.in);
		System.out.println("Menu\n1)Owner\n2)Customer");
		int i=a.nextInt();
		if(i==1) {
			obj.addCandy();
		}
		if (i==2) {
			obj.getCost();
			
		}
			System.out.println("Enter again?");
			obj.getCost();

		a.close();
	}

	public void addCandy() {
		Scanner sc =new Scanner(System.in);
		char ch='y';
		String answer;
		double pr;
		do {answer=null;
			System.out.println("Please enter candy name: ");
			answer = sc.nextLine();
			candy.add(answer);
			System.out.println("Please enter price (in dollars) : ");
			pr=sc.nextDouble();
			pr=pr*60.0;
			price.add(pr);
			System.out.println("Enter again? (y/n) ");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		
		sc.close();
		
	}
	@Override
	void getCost() {
		// TODO Auto-generated method stub
		Iterator it1 = candy.iterator();
		int i=1,pos;
		String s;
		Scanner in = new Scanner(System.in);
		Iterator it2 = price.iterator();
		System.out.println("MENU (all prices are in rupees)");
		while(it1.hasNext()&&it2.hasNext()) {
			System.out.print(i);
			System.out.print(it1.next());
			System.out.print("\t");
			System.out.println(it2.next());
			i++;
		}
		System.out.println("Enter your order :");
		s=in.nextLine();
		pos=candy.indexOf(s);
		System.out.println("Price : \t"+price.get(pos));
		in.close();
	}

}
