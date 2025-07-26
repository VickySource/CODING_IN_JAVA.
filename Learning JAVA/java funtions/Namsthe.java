public class Namsthe 
{
    public static void main(String[] args) 
    {
        //printMessage("Namaste Vicky"); //Invoking the printMessage function with a string literal
        String message = "Namaste Vicky"; //Declaring a string variable with a message
        DoNothing(); //Invoking the DoNothing function
        printMessage(message); //Invoking the printMessage function with the message variable
        System.out.println(printMessage(message)); //Printing the returned message from printMessage function
        
    }

     static void DoNothing() 
    {
        //Function does nothing
    }
   
    static String printMessage(String Message) 
    {
        
        return Message; //Returns the message passed to it
    }
}
