public class StringNumber 
{
    public void checkForNums(String s)
    {
        //try to change each glyph in the string to a number. If an error occurs, move 
        // on to the next number.
        for(int i = 0;i < s.length();i++)
        {
            try
            {
                char currChar = s.charAt(i);
                int num = Character.getNumericValue(currChar);
                System.out.println("Number" + num + " found at " + i + " place");
            } catch (NumberFormatException e) {}
        }
    }

    public void checkIfNum(String s)
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

    public void removeNumsToCase(String s, boolean lowerCase)
    {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0;i < s.length();i++)
        {
            try
            {
                char currChar = s.charAt(i);
                int num = Character.getNumericValue(currChar);
                sb.deleteCharAt(i);
            } catch (NumberFormatException e) {}
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