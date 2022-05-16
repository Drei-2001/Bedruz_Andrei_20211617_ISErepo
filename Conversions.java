import java.util.*;
public class Conversions
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("String manipulation Software");
        System.out.println("[1] convert String to upper Case");
        System.out.println("[2] convert String to lower Case");
        System.out.println("[3] check if String is a valid number");
        System.out.println("[4] remove numbers in string and change case");
        System.out.println("[5] Conversion System (meters and feet/ centimeters to inches");
        int choice1 = sc.nextInt();
        System.out.println("Input String:");
        String string = sc.nextLine();
        sc.close();
    }

}