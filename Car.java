import java.util.Scanner;
class Car extends Showroom implements utility
{
    String car_name;
    String car_color;
    String car_fuel;
    int car_price;
    String car_type;
    int car_mileage;

    @Override
    public void getDetails()
    {
       System.out.println("CAR NAME: "+car_name); 
       System.out.println("CAR COLOR: "+car_color);
       System.out.println("Fuel Type: "+car_fuel);
       System.out.println("PRICE: "+car_price);
       System.out.println("CAR TYPE: "+car_type);
       System.out.println("Mileage: "+car_mileage);
    }
    @Override
    public void setDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("===================*** ENTER THE CAR DETAIL **=================");
        System.out.println();
        System.out.print("CAR NAME: ");
        car_name= sc.nextLine();
        System.out.print("CAR COLOR: ");
        car_color=sc.nextLine();
        System.out.print("FUEL TYPE: ");
        car_fuel=sc.nextLine();
        System.out.print("CAR TYPE: ");
        car_type=sc.nextLine();
        System.out.print("PRICE: ");
        car_price=sc.nextInt();
        System.out.print("MILEAGE: ");
        car_mileage=sc.nextInt();
    }

}