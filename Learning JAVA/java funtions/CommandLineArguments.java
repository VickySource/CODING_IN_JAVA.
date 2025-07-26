public class CommandLineArguments
{
    public static void main(String[] args)
    {   
        // This program prints the command line arguments passed to it
        
        getArguments(args); // Invoking the getArguments function with the command line arguments
    }

    static void getArguments(String[] args)
    {
        System.out.println("Number of arguments: " + args.length);
        for (int i = 0; i< args.length; i++)
        {
            System.out.println("Argument " + i + ":" + args[i]);
        }
    }
}