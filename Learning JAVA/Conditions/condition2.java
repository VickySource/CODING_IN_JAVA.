public class condition2
{
    //convert day month in digit : if input 5 then return May
    static String getMonth(int Month)
    {
        switch(Month)
        {
            case 1:
                return "Jan";
            case 2:
                return  "feb";
            case 3:
                return "march";
            case 4:
                return  "Ap";
            case 5:
                return "may";
            case 6:
                return  "jun";
            case 7:
                return "jul";
            case 8:
                return  "aug";
            case 9:
                return "sep";
            case 10:
                return  "oct";
            case 11:
                return "november";
            case 12:
                return "December";
        }
         return "Enterd Incorrect Data";
    }

    public static void main (String[] args)
    {
        System.out.println(getMonth(8));
    }
}

