public class StringNumber 
{
    public void checkForNums(String s)
    {
        for(int i = 0;i < s.length();i++)
        {
            //try to change each glyph in the string to a 
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
        try 
        {
            float nums = Float.parseFloat(s);
            System.out.println("String " + nums + " is a number");
            
        } catch (NumberFormatException e) 
        {
            System.out.println("String " + e + " is not a number");
        }
    }

    public void removeNumsToCase(String s, boolean strCase)
    {

    }
}
