package designpattern;
interface employee{
	 int salary();
}
 class AndroidDeveloper implements employee{
	 public int salary() {
		 System.out.println("getting android developer salary:");
		 return 50000;
	 }
}
 class WebDeveloper implements employee
 {
	 public int salary() {
		 System.out.println("getting web developer salary:");
		 return 40000;
	 }
 }
class EmployeeFactory{
	public static employee getEmployee(String empType) {
		 if(empType.trim().equalsIgnoreCase("Android")) {
			 return new AndroidDeveloper();
		 }else if (empType.trim().equalsIgnoreCase("Web")) {
			 return new WebDeveloper();
		 }else {
			 return null;
		 }
	}
}
public class A {
public static void main(String[] args) {
	employee emp=EmployeeFactory.getEmployee("Android");
	System.out.println(emp);
	int salary = emp.salary();
	System.out.println("salary"+salary);
	
	employee emp1=EmployeeFactory.getEmployee("Web");
	int salary2 = emp1.salary();
	System.out.println("salary"+salary2);
}
}
