import java.util.Scanner;
class person{
	int age;
	String name;
	String gender;
	String address;
	person(String pname, int ag, String gen, String adds){
		age = ag;
		name = pname;
		gender = gen;
		address = adds;
	}
}
class employee extends person{
	int empid;
	String cmpnyname;
	String qualification;
	int salary;
	employee(String pname, int ag,String gen, String adds, int eid, String cname, String qual, int sal){
		super(pname,ag,gen,adds);
		empid = eid;
		cmpnyname = cname;
		qualification = qual;
		salary = sal;
	}
}
class teachers extends employee{
	String department;
	int tchr_id;
	teachers(String pname, int ag, String gen, String adds, int eid, String cname, String qual, int sal, int tid, String dept){
		super(pname,ag,gen,adds,eid,cname,qual,sal);
		department = dept;
		tchr_id = tid;
	}
	void put()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Address: "+address);
		System.out.println("Employee ID: "+empid);
		System.out.println("Company name: "+cmpnyname);
		System.out.println("Qualification: "+qualification);
		System.out.println("Salary: "+salary);
		System.out.println("Teacher ID: "+tchr_id);
		System.out.println("Department: "+department);
	}
}
public class people{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of entries required: ");
		int n = sc.nextInt();
		teachers t[] = new teachers[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Name: ");
			String na = sc.next();
			System.out.println("Enter the Age: ");
			int a = sc.nextInt();
			System.out.println("Enter the Gender: ");
			String g = sc.next();
			System.out.println("Enter the Address: ");
			String ad = sc.next();
			System.out.println("Enter the Employee ID: ");
			int eid = sc.nextInt();
			System.out.println("Enter the Company name: ");
			String c = sc.next();
			System.out.println("Enter the Qualification: ");
			String q = sc.next();
			System.out.println("Enter the Salary: ");
			int s = sc.nextInt();
			System.out.println("Enter the Teacher ID: ");
			int tid = sc.nextInt();
			System.out.println("Enter the Department: ");
			String d = sc.next();
			t[i] = new teachers(na,a,g,ad,eid,c,q,s,tid,d);
		}
		for(int i=0;i<n;i++)
		{
			t[i].put();
		}
	}
}