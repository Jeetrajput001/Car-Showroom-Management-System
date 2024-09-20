import java.util.Scanner;

interface utility
{
    public void getDetails();
    public void setDetails();
}
public class Main
{
    public static void main_menu()
    {
        System.out.println();
        System.out.println("====***** WELCOME TO CAR SHOWROOM MANAGEMENT SYSTEM *****====");
        System.out.println();
        System.out.println("=============================================================");
        System.out.println();
        System.out.println("1) ADD NEW SHOWROOM    2) ADD NEW EMPLOYEE  3)ADD NEW  CAR   ");
        System.out.println();
        System.out.println("4) GET SHOWROOM        5) GET EMPLOYEE      6)GET CAR"        );
        System.out.println();
        System.out.println("=============================================================");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[]=new Showroom[5];
        Employee employee[]=new Employee[5];
        Car car[]= new Car[6] ;
        int car_counter =0;
        int showroom_counter=0;
        int employee_counter=0;
        int choice =100;
        while(choice!=0)
        {

            main_menu();
            System.out.println("Enter Your Choice (1-6)");
            choice =sc.nextInt();
            while (choice<7 &&choice>0)
            {
                switch (choice)
                {
                    case 1:
                        showroom[showroom_counter]=new Showroom();
                        showroom[showroom_counter].setDetails();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1]. ADD NEW SHOWROOM ");
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        System.out.println("Enter Your Choice");
                        choice= sc.nextInt();
                        break;
                    case 2:
                        employee[employee_counter]=new Employee();
                        employee[employee_counter].setDetails();
                        employee_counter++;
                        System.out.println();
                        System.out.println("1]. ADD NEW EMPLOYEE ");
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        System.out.println("Enter Your Choice");
                        choice= sc.nextInt();
                        break;
                    case 3:
                        car[car_counter]=new Car();
                        car[car_counter].setDetails();
                        car_counter++;
                        System.out.println();
                        System.out.println("1]. ADD NEW CAR ");
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        System.out.println("Enter Your Choice");
                        choice= sc.nextInt();
                        break;
                    case 4:
                        if (showroom_counter>0 )
                        {
                            for (int i = 0; i < showroom_counter; i++)
                            {
                                showroom[i].getDetails();
                                System.out.println();
                                System.out.println();
                            }
                        }
                        else
                        {
                            System.out.println("No Showroom Details Is Here Please Set The Details First");
                        }
                            System.out.println();
                            System.out.println("9]. GO BACK TO MAIN MENU");
                            System.out.println("0]. EXIT ");
                            System.out.println("Enter Your Choice");
                            choice = sc.nextInt();
                            break;
                    case 5:
                        if (employee_counter > 0)
                        {
                            for (int i = 0; i < employee_counter; i++)
                            {
                                employee[i].getDetails();
                                System.out.println();
                                System.out.println();
                            }
                        }
                        else
                        {
                            System.out.println("No Employee Details Is Here Please Set The Details First");
                        }
                        System.out.println();
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        System.out.println("0]. EXIT ");
                        System.out.println("Enter Your Choice");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        if (car_counter > 0)
                        {
                            for (int i = 0; i < car_counter; i++)
                            {

                                car[i].getDetails();
                                System.out.println();
                                System.out.println();

                            }
                        }
                        else
                        {
                            System.out.println("NO DATA IS HERE PLEASE SET THE DATA FIRST");
                        }

                        System.out.println();
                        System.out.println("9]. GO BACK TO MAIN MENU");
                        System.out.println("0]. EXIT ");
                        System.out.println("Enter Your Choice");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("INVALID CHOICE");
                        break;

                }
            }
        }
    }

}
