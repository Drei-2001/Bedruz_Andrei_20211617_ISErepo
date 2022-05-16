import java.util.*;
public class Conversions
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        boolean endLoop = false;
        String string;

        while(endLoop == false)
        {
            Options();
            int choice1 = sc.nextInt();
            sc.nextLine();
            switch (choice1)
            {
                case 1:
                    System.out.println("Input String:");
                    string = sc.nextLine();
                    System.out.println("String = " + string.toUpperCase() + "\n\n");
                    break;
                case 2:
                    System.out.println("Input String:");
                    string = sc.nextLine();
                    System.out.println("String = " + string.toLowerCase() + "\n\n");
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
                case 6:
                    endLoop = true;
            }
        }
        sc.close();
    }

    public static void Options()
    {
        System.out.println("String manipulation Software");
        System.out.println("[1] Convert String to upper Case");
        System.out.println("[2] Convert String to lower Case");
        System.out.println("[3] Check if String is a valid number");
        System.out.println("[4] Remove numbers in string and change case");
        System.out.println("[5] Conversion System (meters and feet/ centimeters to inches");
        System.out.println("[6] Exit");
    }

}