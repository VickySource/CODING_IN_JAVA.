public class Funtion4 
{
    // Funtion to write isDigit or isNumber return True if it is digit
    static boolean isNumber(String input)
    {
        // assume the result have a value
         boolean result = true;

         for (int index = 1; index < input.length(); index++)
         {
             char Charcter = input.charAt(index);

             if (Charcter < '0'|| Charcter > '9' )
             {
                 result = false;
             }
         }
         return result;
    }
      // invoking the funtion 

      static void Invoking_Method()
      {
        boolean result = isNumber("12");
        if (result)
        {
            System.out.println("The given Input exactly have valid Numbers");
        }    
        else 
        {
            System.out.println("The given Input is Not valid Numbers");
        }
      }


    public static void main(String[] args)
    {
        Invoking_Method();
    }
    
}
