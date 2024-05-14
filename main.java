import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        car car = new car();
        System.out.print("Please enter your company name: ");
        String name = sc.nextLine();
        System.out.print("please enter your model:");
        String model = sc.nextLine();
        System.out.println("Please enter year of the car");
        int year = sc.nextInt();
        car.set_name(name);
        car.set_model(model);
        car.set_year(year);

System.out.println("company name" + car.get_name());
System.out.println("Model" + car.get_year());
System.out.println("year" + car.get_year());
        car.drive();
    }
}
