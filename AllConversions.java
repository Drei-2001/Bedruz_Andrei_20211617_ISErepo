import java.util.*;
public class AllConversions
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        boolean endLoop1 = false;
        String inputStr;

        while(endLoop1 == false)
        {
            System.out.println("String manipulation Software");
            System.out.println("[1] Convert String to upper Case");
            System.out.println("[2] Convert String to lower Case");
            System.out.println("[3] Check if String has a valid number");
            System.out.println("[4] Check if String is a valid number");
            System.out.println("[5] Remove numbers in string and change case");
            System.out.println("[6] Conversion System (meters and feet/ centimeters to inches");
            System.out.println("[7] Exit");
            int choice1 = sc.nextInt();
            sc.nextLine();
            switch (choice1)
            {
                //upperCase
                case 1:
                    System.out.println("Input String:");
                    inputStr = sc.nextLine();
                    System.out.println("String = " + StringNumber.toUpperCase(inputStr) + "\n\n");
                    break;
                //lowerCase
                case 2:
                    System.out.println("Input String:");
                    inputStr = sc.nextLine();
                    System.out.println("String = " + StringNumber.toUpperCase(inputStr) + "\n\n");
                    break;
                //hasNumber
                case 3:
                    System.out.println("Input String:");
                    inputStr = sc.nextLine();
                    StringNumber.checkForNums(inputStr);
                    System.out.println("\n");

                    break;    
                //isNumber
                case 4:
                    System.out.println("Input String:");
                    inputStr = sc.nextLine();
                    StringNumber.checkIfNum(inputStr);
                    System.out.println("\n");

                    break;
                //Remove Numbers and change case
                case 5:
                    System.out.println("Input String:");
                    inputStr = sc.nextLine();
                    System.out.println("Change to [U]pperCase or [L]owerCase?");
                    String inputTwo = sc.nextLine();
                    if (inputTwo.equals("U"))
                    {
                        inputStr  = StringNumber.removeNums(inputStr);
                        System.out.println("New String  = "+StringNumber.toUpperCase(inputStr) + "\n");

                    }
                    else if (inputTwo.equals("L"))
                    {
                        inputStr = StringNumber.removeNums(inputStr);
                        System.out.println("New String  = "+StringNumber.toLowerCase(inputStr) + "\n");
                    }
                    else 
                    {
                        System.out.println("Input incorrect.");
                    }
                    System.out.println("\n");
                    break;

                //Conversions
                case 6:
                    System.out.println("Convertion System");
                    System.out.println("[1] Convert hours to minutes");
                    System.out.println("[2] Convert minutes to hours");
                    System.out.println("[3] Convert minutes to seconds");
                    System.out.println("[4] Convert seconds to minutes");
                    int optionsTwo = sc.nextInt();
                    double timeInput,timeResult;
                    switch(optionsTwo)
                    {
                        case 1:
                            System.out.println("Input Hours:");
                            timeInput = sc.nextInt();
                            timeResult = Conversions.hrToMin(timeInput);
                            System.out.println("Minutes = " + timeResult);
                            break;
                        case 2:
                            System.out.println("Input Minutes:");
                            timeInput = sc.nextInt();
                            timeResult = Conversions.minToHr(timeInput);
                            System.out.println("hours = " + timeResult);
                            break;
                        case 3:
                            System.out.println("Input Minutes:");
                            timeInput = sc.nextInt();
                            timeResult = Conversions.hrToMin(timeInput);
                            System.out.println("seconds  = " + timeResult);
                            break;
                        case 4:
                            System.out.println("Input Seconds:");
                            timeInput = sc.nextInt();
                            timeResult = Conversions.minToHr(timeInput);
                            System.out.println("Minutes = " + timeResult);
                            break;
                        default:
                            System.out.println("wrong Input. Please try again");
                            break;
                    }
                    //includes a space. fixes nextLine error
                    sc.nextLine();
                    System.out.println("\n");
                    break;
                //exit
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
    
}
