class Sample
{
    //Checking  is positive Number
    ////Checking  is positive OR Negative Number
    //This code is good but when the value is 0 it shows neagative 
    // for that i will write one that is greater than = to handle code 
    static void CheckingNegativeNum(int Number)
    {
        if (Number >= 0)
        {
            System.out.println("Its positive");
        }
        else
        {
             System.out.println("Its Negative");
        }
    }


    public static void main (String [] args)
    {
        CheckingNegativeNum(0);
    }
}