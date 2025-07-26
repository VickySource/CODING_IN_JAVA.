public class cmdlinearg 
{
    public static void main (String [] args)
    {
        CmdLineArg(args);
    }
    static void CmdLineArg(String[] args)
    {
        
        for  (int index = 1 ; index < args.length; index++ )
        {
            System.out.println("Argument : " + index + "" + args[index]);
        }
    }
}
