public class Loop2 
{
    //Reversing the numbers from 10 to 1

    static void Reversing()
    {
        for (int index = 10; index >= 0; index--)
        {
            //TO skip at 5 
            if (index == 5)
        //If the given condition is Satisfy it go to loop it will not print only 5
            //continue;
            //For break what it does i will not print the values after 5 
            break;
            System.out.println(index);
        }
    }

    public static void main(String[] args)
    {
        Reversing();
    }
    
}
