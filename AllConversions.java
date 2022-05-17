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
                    StringNumber.checkForNums(string);
                    System.out.println("\n");

                    break;    
                //isNumber
                case 4:
                    System.out.println("Input String:");
                    string = sc.nextLine();
                    StringNumber.checkIfNum(string);
                    System.out.println("\n");

                    break;
                //Remove Numbers and change case
                case 5:
                    System.out.println("Input String:");
                    string = sc.nextLine();
                    System.out.println("Change to [U]pperCase or [L]owerCase?");
                    String inputTwo = sc.nextLine();
                    if (inputTwo.equals("U"))
                    {
                    StringNumber.removeNumsToCase(string, false);

                    }
                    else if (inputTwo.equals("L"))
                    {
                        StringNumber.removeNumsToCase(string, true);
                    }
                    else 
                    {
                        System.out.println("Input incorrect.");
                    }
                    System.out.println("\n");
                    break;

                //Conversions
                case 6:
                    Options2();
                    int optionsTwo = sc.nextInt();
                    double timeInput;
                    switch(optionsTwo)
                    {
                        case 1:
                            System.out.println("Input Hours:");
                            timeInput = sc.nextInt();
                            Conversions.hrToMin(timeInput);
                            break;
                        case 2:
                            System.out.println("Input Minutes:");
                            timeInput = sc.nextInt();
                            Conversions.minToHr(timeInput);
                            break;
                        case 3:
                            System.out.println("Input Minutes:");
                            timeInput = sc.nextInt();
                            Conversions.hrToMin(timeInput);
                            break;
                        case 4:
                            System.out.println("Input Seconds:");
                            timeInput = sc.nextInt();
                            Conversions.minToHr(timeInput);
                            break;
                        default:
                            System.out.println("wrong Input. Please try again");
                            break;
                    }
                    string = sc.nextLine();
                    System.out.println("\n");

                    break;
                case 7:
                    endLoop1 = true;
                    break;                
                default:
                    System.out.println("Wrong input. Please try again");
                    break;
            }   
        }
        System.out.println("GoodBye!");
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

    public static void Options2()
    {
        System.out.println("Convertion System");
        System.out.println("[1] Convert hours to minutes");
        System.out.println("[2] Convert minutes to hours");
        System.out.println("[3] Convert minutes to seconds");
        System.out.println("[4] Convert seconds to minutes");
    }

}