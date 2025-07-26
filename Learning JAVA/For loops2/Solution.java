public class Solution
{
    //Generating numbers from to 5
    static void generatingNo_1_To_5()
    {
        //         Start; Stop; Inc;
        for (int Number = 1; Number <= 5; Number++)
        System.out.print(Number);
    }

    //user requires genration of  InputBased numbers
    static void genratingNumbersUserInputBased(int Input)
    {
        for (int Start = 1; Start <= Input; Start++)
        System.out.println(Start);
    }

    //Print each character in the string "Vicky".
    // we use .Length() whe becuse We don't know the Size of String
    //For retrives used charAt its a built in funtion
    static void PrintCharWithStrings(String Input)
    {
        //Remember One Thing if the condtion <= it givees
        //--value but it outOfBound Error it means the last elemnt reads but There is no data So
        // we get error
        for(int index = 0; index < Input.length(); index++)
        {
            System.out.println(Input.charAt(index));
        }
    }

    static void readTheEachElement(String[] StudentNames)
    {            
        //Loop through a array: fruits = {"Dhanu", "Santhu", "Vikas"}, and print each Each Student Names
        for(int index = 0; index < StudentNames.length; index++)
        {
            System.out.println("Student " +index+ ":" + StudentNames[index]);   
        }
    }

    static int Factorial(int n) {
    int result = 1;
    if (n == 0)
    {
        return 0;
    }
    for (int i = 1; i <= n; i++) 
    {
        result *= i;
    }

    return result;
}
    public static void main(String[] args)

    {   
        // String[] StudentList ={"Dhanu","Santhu", "Vikas"};
        // readTheEachElement(StudentList);
        //genratingNumbersUserInputBased(8);
        int Fact = 0;
         System.out.println(Factorial(Fact));
    }

}