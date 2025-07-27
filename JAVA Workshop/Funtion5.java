import java.util.Scanner;

public class Funtion5 
{

    public static void redingInput()
    {
        String Name;
        Scanner Reader = new Scanner(System.in);
        System.out.print("Enter Your Name :");
        Name = Reader.nextLine();
        System.out.println("Subha Munjane! " +Name);
        Reader.close();
    }  
    
    public static void main (String[] args)
    { 
        redingInput();
    }
}
