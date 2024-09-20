import java.util.Scanner;

public class Showroom implements utility
{
    String showroom_name;
    String showroom_manager_name;
    String showroom_address;
    int no_of_employee;
    int no_of_car;

    @Override
    public void getDetails()
    {
        System.out.println("SHOWROOM NAME: "+showroom_name);
        System.out.println("SHOWROOM ADDRESS: "+showroom_address);
        System.out.println("SHOWROOM MANAGER NAME: "+showroom_manager_name);
        System.out.println("CAR IN STOCK : "+no_of_car);
        System.out.println("NO. OF WORKING EMPLOYEE: "+no_of_employee);
    }
    @Override
    public void setDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("===================*** ENTER THE CAR DETAIL **=================");
        System.out.println();
        System.out.print("SHOWROOM NAME : ");
        showroom_name= sc.nextLine();
        System.out.print("SHOWROOM MANAGER NAME: ");
        showroom_manager_name=sc.nextLine();
        System.out.print("SHOWROOM ADDRESS: ");
        showroom_address=sc.nextLine();
        System.out.print("NO OF EMPLOYEE WORKING : ");
        no_of_employee=sc.nextInt();
        System.out.print("NO OF CARS ARE IN SHOWROOM: ");
        no_of_car=sc.nextInt();
    }
    
}
