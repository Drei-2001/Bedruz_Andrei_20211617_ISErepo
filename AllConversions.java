import java.util.*;
public class AllConversions
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        boolean endLoop1 = false, endLoop2 = false;
        String string;

        while(endLoop1 == false)
        {
            Options();
            int choice1 = sc.nextInt();
            sc.nextLine();
            switch (choice1)
            {
                //upperCase
                case 1:
                    System.out.println("Input String:");
                    string = sc.nextLine();
                    System.out.println("String = " + string.toUpperCase() + "\n\n");
                    break;
                //lowerCase
                case 2:
                    System.out.println("Input String:");
                    string = sc.nextLine();
                    System.out.println("String = " + string.toLowerCase() + "\n\n");
                    break;
                //hasNumber
                case 3:
                    System.out.println("Input String:");
                    string = sc.nextLine();

                    break;    
                //isNumber
                case 4:
                    System.out.println("Input String:");
                    string = sc.nextLine();

                    break;
                //Conversions.
                case 5:
                    break;
                default:
                    System.out.println("Wrong input. Please try again");
                    break;
                case 6:
                    endLoop1 = true;
            }
            System.out.println("would you like to print more?[Y/N]");
            String choice2 = sc.nextLine();
            while(endLoop2 == false)
            {
                if (choice2.equals("Y"))
                {
                    endLoop2 = false;
                }
                else 
                if (choice2.equals("N"))
                {
                    endLoop2 = true;
                }
                else
                {
                    System.out.println("Input Error");
                }
            }
            
        }
        sc.close();
    }

    public static void Options()
    {
        System.out.println("String manipulation Software");
        System.out.println("[1] Convert String to upper Case");
        System.out.println("[2] Convert String to lower Case");
        System.out.println("[3] Check if String has a valid number");
        System.out.println("[4] Check if String is a valid number");
        System.out.println("[5] Remove numbers in string and change case");
        System.out.println("[6] Conversion System (meters and feet/ centimeters to inches");
        System.out.println("[7] Exit");
        System.out.println("[8] Exit");
    }

}