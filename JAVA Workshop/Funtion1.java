public class Funtion1
{
   
    static  int getSum(int Number1 ,int Number2)
    {
      
        int result = Number1 + Number2;
        return result;
    }

    // invoking the getSum Method to of below funtion
    static void Invocation_Call()
    {
       int Sum = getSum(20,50);
       System.out.println("Addition of Two Numbers : " +Sum); 
    }

    public static void main(String [] args)
    {
        Invocation_Call();
    }
}