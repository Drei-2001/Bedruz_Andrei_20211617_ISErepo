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
        String temp = StringNumber.removeNums("11617");
        assert temp.equals(""): "test '11617' failed";
        temp = StringNumber.removeNums("a2ndr3ei B8e765d0ruZ");
        assert temp.equals("andrei BedruZ"): "test 'a2ndr3ei B8e765d0ruZ' failed";
        temp = StringNumber.removeNums("The GodFather");
        assert temp.equals("The GodFather"): " test 'The GodFather' has passed";
        
        //prints if everything passes
        System.out.println("checkRemoveNums passed");
    }

    public static void testHrToMin()
    {
        double temp = Conversions.hrToMin(1);
        assert temp == 60.0 : "test hours > 0 failed";
        temp = Conversions.hrToMin(-10);
        assert temp == -600.0: "test hours < 0 failed";
        temp = Conversions.hrToMin(0);
        assert temp == 0.0 : "test hours = 0 failed";

        //prints if everything passes
        System.out.println("hrToMin passed");
    }

    public static void testMinToHr()
    {
        double temp = Conversions.minToHr(60);
        assert temp == 1.0 : "test hours > 0 failed";
        temp = Conversions.minToHr(-600);
        assert temp == -10.0: "test hours < 0 failed";
        temp = Conversions.minToHr(0);
        assert temp == 0.0 : "test hours = 0 failed";

        //prints if everything passes
        System.out.println("minToHr passed");
    }
}
