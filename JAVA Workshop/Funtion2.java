public class Funtion2 {
    //writing the funtion to SwapTwoNUmbers
    static void  swap1(int Input1, int Input2)
    {
        // should create one more variable to store the first value 
        // then interchage to next 
        // it does not work if variable it takes pass by value

        int Temp = Input1;
        Input1 = Input2;
        Input2 = Temp;
    }
        
    // Using array swapTwoNumbers call by refference
        static void swap2(int[] Numbers)
    {
        int temp   = Numbers[0];
        Numbers[0] = Numbers[1];
        Numbers[1] = temp;
    }
      
    static void Invocation_Call_Swap1()
    { 
        int number1 =1, number2 = 2;  
        swap1(number1 , number2);
        
        int[] Number3 = {10,20,30};
        System.out.println( "BEFORE Input[0] :" +Number3[0] + " Input[1] :"  + Number3[1] + " "+ Number3[2]);
        swap2(Number3);

        System.out.println( "AFTER Input[0] " +Number3[0] + " Input[1] "  + Number3[1] + " "+ Number3[2]);
    }

  
    public static void main(String[] args)
    {
        Invocation_Call_Swap1();
    }
}
