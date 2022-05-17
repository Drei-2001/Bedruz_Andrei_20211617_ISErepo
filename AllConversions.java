import java.util.*;
public class AllConversions
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        boolean endLoop1 = false;
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
                //Remove Numbers and change case
                case 5:
                    break;

                //Conversions.
                case 6:
                    break;
                case 7:
                    endLoop1 = true;
                    break;                
                default:
                    System.out.println("Wrong input. Please try again");
                    break;
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
    }

}