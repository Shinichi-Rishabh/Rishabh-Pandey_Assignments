import java.util.*;
public class Student {

	int sub1,sub2,sub3,total=0;
	double avg=0.0;
	Student(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of subject A: \t");
		sub1=sc.nextInt();
		System.out.println("Enter marks of subject B: \t");
		sub2=sc.nextInt();
		System.out.println("Enter marks of subject C: \t");
		sub3=sc.nextInt();
		total = sub1+sub2+sub3;
		avg=total/3;
		System.out.println("Total: \t"+total);
		System.out.println("Average: \t"+avg);
	}
	public int returnsub1() {
		return sub1;
	}
	public int returnsub2() {
		return sub2;
	}
	public int returnsub3() {
		return sub3;
	}
	public static void main(String[] args) {
		int tot=0;
		double average=0.0;
		System.out.println("For first student :");
		Student s1=new Student();
		System.out.println("For second student :");
		Student s2=new Student();
		System.out.println("For third student :");
		Student s3=new Student();
		tot=s1.returnsub1()+s2.returnsub1()+s3.returnsub1();
		average=tot/3;
		System.out.println("Total marks scored by all students in Subject A : \t"+tot);
		System.out.println("Average marks scored by all students in Subject A : \t"+average);
		tot=s1.returnsub2()+s2.returnsub2()+s3.returnsub2();
		average=tot/3;
		System.out.println("Total marks scored by all students in Subject B : \t"+tot);
		System.out.println("Average marks scored by all students in Subject B : \t"+average);
		tot=s1.returnsub3()+s2.returnsub3()+s3.returnsub3();
		average=tot/3;
		System.out.println("Total marks scored by all students in Subject C : \t"+tot);
		System.out.println("Average marks scored by all students in Subject C : \t"+average);
	}

}
