import java.util.Scanner;

public class Employee extends Showroom implements utility
{
    String employee_name;
    String employee_dept_name;
    int emp_id;
    int age;

    @Override
    public void getDetails()
    {
        System.out.println("EMPLOYEE NAME: "+employee_name);
        System.out.println("EMPLOYEE ID: "+emp_id);
        System.out.println("EMPLOYEE AGE: "+age);
        System.out.println("EMPLOYEE DEPARTMENT NAME: "+employee_dept_name);
    }
    @Override
    public void setDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("===================*** ENTER THE EMPLOYEE DETAIL **=================");
        System.out.println();
        System.out.print("EMPLOYEE NAME: ");
        employee_name= sc.nextLine();
        System.out.print("EMPLOYEE DEPTNAME: ");
        employee_dept_name=sc.nextLine();
        System.out.print("EMPLOYEE AGE: ");
        age=sc.nextInt();
        System.out.print("EMPLOYEE ID: ");
        emp_id=sc.nextInt();

    }

}
