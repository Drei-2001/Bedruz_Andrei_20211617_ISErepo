import java.util.*;
public class AllConversions
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean endLoop1 = false, endLoop2 = false;
        String str;

        while(endLoop1 == false)
        {
            try 
            {
                Options();
                int choice1 = sc.nextInt();
                sc.nextLine();
                switch (choice1)
                {
                    //upperCase
                    case 1:
                        System.out.println("Input String:");
                        str = sc.nextLine();
                        System.out.println("String = " + str.toUpperCase() + "\n\n");
                        break;
                    //lowerCase
                    case 2:
                        System.out.println("Input String:");
                        str = sc.nextLine();
                        System.out.println("String = " + str.toLowerCase() + "\n\n");
                        break;
                    //hasNumber
                    case 3:
                        System.out.println("Input String:");
                        str = sc.nextLine();

                        StringNumber.checkForNums(str);

                        break; 

                    //isNumber
                    case 4:
                        System.out.println("Input String:");
                        str = sc.nextLine();

                        StringNumber.checkIfNum(str);
                        break;

                    //Remove Numbers and change case
                    case 5:
                        System.out.println("Input String:");
                        str = sc.nextLine();
                        System.out.println("[L]owerCase or [U]pperCase");
                        String str2 = sc.nextLine();
                        if (str2.equals("L"))
                        {
                            StringNumber.removeNumsToCase(str,true);
                        }
                        else if (str2.equals("U"))
                        {
                            StringNumber.removeNumsToCase(str,false);
                        }
                        else
                        {
                            System.out.println("Input error. Please try again");
                        }
                        break;
                    //Conversions.
                    case 6:
                        break;
                    //Exit
                    case 7:
                        endLoop1 = true;
                        break;
                    default:
                        System.out.println("Wrong input. Please try again");
                        break;
                }
            } 
            catch (InputMismatchException e) 
            {
                System.out.println("error input. Please try again");
            }  
        }
        sc.close();
        System.out.println("GoodBye!");
    }

    public static void Options()
    {
        System.out.println("\nString manipulation Software\n");
        System.out.println("[1] Convert String to upper Case");
        System.out.println("[2] Convert String to lower Case");
        System.out.println("[3] Check if String has a valid number");
        System.out.println("[4] Check if String is a valid number");
        System.out.println("[5] Remove numbers in string and change case");
        System.out.println("[6] Conversion System (meters and feet/ centimeters to inches");
        System.out.println("[7] Exit");
    }

}