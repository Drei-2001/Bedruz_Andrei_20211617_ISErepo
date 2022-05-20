public class TestCases
{
    public static void main(String[] args) 
    {
        testToUpperCase();
        testToLowerCase();
        testCheckForNums();
        testCheckIfNums();
        testCheckRemoveNums();
        testHrToMin();
        testMinToHr();
    }

    public static void testToUpperCase()
    {
        String temp = StringNumber.toUpperCase("a2ndr3i");
        assert temp.equals("A2NDR3I") : "test'a2ndr3i' failed";
        temp = StringNumber.toUpperCase("Bedruz");
        assert temp.equals("BEDRUZ") : "test'Bedruz' failed";
        temp = StringNumber.toUpperCase("andrei vann anthony a bedruz");
        assert temp.equals("ANDREI VANN ANTHONY A BEDRUZ"): "test 'andrei vann anthony a bedruz' failed";
        temp = StringNumber.toUpperCase("THE GOD FATHER");
        assert temp.equals("THE GOD FATHER"): "test 'THE GOD FATHER' failed";
        temp = StringNumber.toUpperCase("1617");
        assert temp.equals("1617"): "test '1617' failed";

        //prints if everything passes
        System.out.println("testToUpperCase passed");
    }

    public static void testToLowerCase()
    {
        String temp = StringNumber.toLowerCase("a2ndr3i");
        assert temp.equals("a2ndr3i") : "test'a2ndr3i' failed";
        temp = StringNumber.toLowerCase("Bedruz");
        assert temp.equals("bedruz") : "test'Bedruz' failed";
        temp = StringNumber.toLowerCase("andrei vann anthony a bedruz");
        assert temp.equals("andrei vann anthony a bedruz"): "test 'andrei vann anthony a bedruz' failed";
        temp = StringNumber.toLowerCase("THE GOD FATHER");
        assert temp.equals("the god father"): "test 'THE GOD FATHER' failed";
        temp = StringNumber.toLowerCase("1617");
        assert temp.equals("1617"): "test '1617' failed";

        //prints if everything passes
        System.out.println("testToLowerCase passed");
    }

    public static void testCheckForNums()
    {

    }

    public static void testCheckIfNums()
    {

    }

    public static void testCheckRemoveNums()
    {

    }

    public static void testHrToMin()
    {

    }

    public static void testMinToHr()
    {
        
    }
}
