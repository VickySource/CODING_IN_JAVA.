public class ArraySum 
{

    public static void main(String[] args)
    {
        int[] Sum = {1,3,4,-5};
        ArraySum(Sum);
    }
    static void ArraySum(int[] numbers)
    {
        int sum = 0 ;
        for (int i = numbers.length-1; i >= 0 ;  i--)
        {
            sum += numbers[i];
        }
         System.out.println("The Sum is : " +sum);
    }
    
    
}
