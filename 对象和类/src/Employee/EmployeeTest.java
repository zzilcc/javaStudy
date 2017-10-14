package Employee;

public class EmployeeTest {
	public static void main(String args[]) {
        // 使用构造器创建两个对象
		Employee empOne = new Employee("黄紫茜");
		Employee empTwo = new Employee("黄龙翔");
		//调用这两个对象的成员方法
		empOne.empAge(21);
		empOne.empDesignation("初级程序媛");
		empOne.empSalary(7500);
		empOne.printEmployee();
		
		empTwo.empAge(20);
		empTwo.empDesignation("高中生");
		empTwo.empSalary(-1000);
		empTwo.printEmployee();
	}
}
