public  class StringNumber 
{
    public static String toUpperCase(String s)
    {
        return s.toUpperCase();
    }

    public static String toLowerCase(String s)
    {
        return s.toLowerCase();
    }
    public static void checkForNums(String s)
    {
        //try to change each glyph in the string to a number. If an error occurs, move 
        // on to the next number.
        for(int i = 0;i < s.length();i++)
        {
            int count  = i+1;
            char currChar = s.charAt(i);
            if (Character.isDigit(currChar))
            {
                System.out.println("Number " + currChar + " found at " + " place " + count);

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
        StringBuilder sb = new StringBuilder(s);
        int count = 0,size = sb.length();
        while(count < size)
        {
            char currChar = sb.charAt(count);
            if (Character.isDigit(currChar))
            {
                sb = sb.deleteCharAt(count);
                size = sb.length();
            }
            else 
            {
                count++;
            }
            System.out.println();
        }
        
        if (lowerCase == true)
        {
            s = sb.toString().toLowerCase();
        }
        else if (lowerCase == false)
        {
            s = sb.toString().toUpperCase();
        }
        System.out.println("Final String = " + s);
    }
}
