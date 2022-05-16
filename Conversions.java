import java.util.*;
public class Conversions
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        boolean endLoop = false;
        String string;

        System.out.println("String manipulation Software");
        System.out.println("[1] convert String to upper Case");
        System.out.println("[2] convert String to lower Case");
        System.out.println("[3] check if String is a valid number");
        System.out.println("[4] remove numbers in string and change case");
        System.out.println("[5] Conversion System (meters and feet/ centimeters to inches");

        int choice1 = sc.nextInt();
        
        
        sc.close();

        while(endLoop == false)
        {
            switch (choice1)
            {
                case 1:
                    System.out.println("Input String:");
                    string = sc.nextLine();
                    System.out.println("String = " + string.toUpperCase());
                    break;
                case 2:
                    System.out.println("Input String:");
                    string = sc.nextLine();
                    System.out.println("String = " + string.toLowerCase());
                    break;
                case 3:
                    System.out.println("Input String:");
                    string = sc.nextLine();

                    break;    
                case 4:
                    System.out.println("Input String:");
                    string = sc.nextLine();

                    break;
                case 5:
                    break;
                default:
                    System.out.println("Wrong input. Please try again");
                    break;
            }
        }
        
    }

}