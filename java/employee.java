import java.util.Scanner;
public class employee{
	int eno;
	String ename;
	int esalary;
	
	public  void get(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee no:\n");
		eno=sc.nextInt();
		System.out.println("Enter the Employee name:");
		ename=sc.next();
		System.out.println("Enter the Employee salary:");
		esalary=sc.nextInt();
	}
	public void put(){
		System.out.println("Employee Name is:"+eno);
		System.out.println("Employee Name is:"+ename);
		System.out.println("Employee Name is:"+esalary);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Limit of Employess:");
		int limit=sc.nextInt();
		employee emp[]=new employee[limit];
		for(int i=0;i<limit;i++)
		{
			emp[i]=new employee();
			emp[i].get();
		}
		for(int i=0;i<limit;i++)
		{
		emp[i].put();
		}
		int flag=0;
		System.out.println("Enter the Employee no to search:");
		int val=sc.nextInt();
		for(int i=0;i<limit;i++)
		{
			if(emp[i].eno==val)
			{
				emp[i].put();
				flag++;
				break;
				
			}
		}
		if(flag==0)
		{
			System.out.println("No Employee found");
		}
	}
}