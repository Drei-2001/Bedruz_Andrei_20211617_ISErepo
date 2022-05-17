public  class StringNumber 
{
    public static void checkForNums(String s)
    {
        //try to change each glyph in the string to a number. If an error occurs, move 
        // on to the next number.
        for(int i = 0;i < s.length();i++)
        {
            char currChar = s.charAt(i);
            if (Character.isDigit(currChar))
            {
                System.out.println("Number" + currChar + " found at " + i + " place");

            }
        }
    }

    public static void checkIfNum(String s)
    {
        //a simpler version of checkForNums. Convert string to a float. If an error
        //occurs then the string cannot be a number.
        try 
        {
            float nums = Float.parseFloat(s);
            System.out.println("String " + nums + " is a number");

        } catch (NumberFormatException e) 
        {
            System.out.println("String " + e + " is not a number");
        }
    }

    public static void removeNumsToCase(String s, boolean lowerCase)
    {
        for(int i = 0;i < s.length();i++)
        {
            char currChar = s.charAt(i);
            if (Character.isDigit(currChar))
            {
                String tempChar =  Character.toString(currChar);
                s.replace(tempChar,"");
            }
        }
        
        if (lowerCase == true)
        {
            s.toLowerCase();
        }
        else if (lowerCase == false)
        {
            s.toUpperCase();
        }
    }
}
