public class LeapYear
{

    public static boolean isLeapYear(int year)
    {
        if (year % 4 != 0)
        {
            return false;
        }

        if (year % 100 != 0)
        {
            return true;
        }

        if (year % 400 == 0)
        {
            return true;
        }

        return true;
    }

    public static void main(String[] args)
    {
        int year = 20012;

        boolean result = isLeapYear(year);

        System.out.println( year + "czy jest przestepny?");
        System.out.println(result);
    }

}
