public class SimpleRecursion
{
    public static void main (String [] args)
    {
        Increment_Value(1);
    }

    static void Increment_Value(int Counter)
    {
        if (Counter < 3)
        {
            Counter = Counter + 1;
            Increment_Value(Counter);
            //System.out.println(Counter);
            Increment_Value(Counter);
            Increment_Value(Counter);
            System.out.println(Counter);
            Increment_Value(Counter);
            System.out.println(Counter);
        }
    }
}