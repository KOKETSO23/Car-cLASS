import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student details = new Student();
        details.modules();
        //prompt
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.print("please enter your surname:");
        String surname = sc.nextLine();

        //setting
        details.set_name(name);
        details.set_surname(surname);
        //displaying
        System.out.println("Your name is " + details.get_name());
        System.out.print("Your surname is " +details.get_surname());
    }
}
