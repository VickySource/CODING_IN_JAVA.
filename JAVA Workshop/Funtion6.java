public class Funtion6 
{
    //print ascii values from the String Input;
    static void getAscci(String Input)
    {
        char Charcter =0;

        for (int index = 0; index < Input.length(); index++)
        {
            Charcter = Input.charAt(index);
            int Ascci = Charcter;

            System.out.println("Ascii value for the " + Charcter + "-" + Ascci );
        }
        
         Charcter = 'a';
    }

    public static void main(String [] args)
    {
        getAscci("A1");
    }
}
