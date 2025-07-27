public class Funtion3 {


    //checking Even or odd if its odd return true or false
    static boolean checkEvenOdd(int Input)
    {
        if (Input %2 == 0)
        {
            System.out.println("Given Number of "+Input+" is Even Number!");
             return true;
        }
           
        else
        {
            System.out.println("Given Number of "+Input+ " is Odd Number!");
            return false;
        }
            
    }


    static void invoke_isEven()
    {
        checkEvenOdd(25);
        checkEvenOdd(30);
        checkEvenOdd(45);
    }




    public static void main(String[]args)
    {
        invoke_isEven();
    }
    
}
