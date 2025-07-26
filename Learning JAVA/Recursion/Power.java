public class Power 
{
    public static void main (String [] args)
    {
        getExponentional(2,1);
    }  
    
    static int getExponentional(int base, int power)
    {
        if (power == 0)
            return 1;

        base *= getExponentional(base,power -1);
        return base;
    }
}
