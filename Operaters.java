public class Operaters 
{
    public static void ArithmaticOperater(int Number1 , int Number2)
    {
        int Addition = Number1 + Number2;
        System.out.println("Addition:" +Number1+ "+" +Number2 + "=" +Addition);

        int Subtraction = Number1 - Number2;
        System.out.println("Subtraction : " +Number1+ "+" +Number2+ "="+Subtraction);

        int Multiplication = Number1 * Number2;
        System.out.println("Multiplication : " +Number1+ "*" +Number2+ "="+Multiplication);

        int Division = Number1 / Number2;
        System.out.println("Division : " +Number1+ "/" +Number2+ " = "+Division);

        int Remainder = Number1 % Number2;
        System.out.println("Remainder : " +Number1+ "%" +Number2+ " = " +Remainder);

        Double Exponentiation = Math.pow(Number1, Number2);
        System.out.println("Exponentiation : " +Number1+ "^" +Number2+ "="+Exponentiation);
    }
    public static void Assignmentoperater(int totalScore)
    {
        //assiging data into answer from TotalScore
        int answer = 2;
        System.out.println("Answer : " +answer);

        //Addition with assignment operator
        answer += totalScore;
        System.out.println("Answer : " +answer);

        //Subtraction with assignment operator
        answer -= totalScore;

        //Multiplication with assignment operator
        answer *= totalScore;
    }
    public static void RelationalOperater(int TommoatoPrice , int CarrotPrice)
    {
        //relational operator is nohting but comparing two values
        boolean result = (TommoatoPrice > CarrotPrice);
        System.out.println("TommoatoPrice  greater than  CarrotPrice : " +result);

        //greater than
        System.out.println("TommoatoPrice > CarrotPrice : " +result);


        //less than
        result = (TommoatoPrice < CarrotPrice);
        System.out.println("TommoatoPrice < CarrotPrice : " +result);

        //greater than or equal to
        result = (TommoatoPrice >= CarrotPrice);
        System.out.println("TommoatoPrice >= CarrotPrice : " +result);

        //less than or equal to
        result = (TommoatoPrice <= CarrotPrice);
        System.out.println("TommoatoPrice <= CarrotPrice : " +result);

        //equal to
        result = (TommoatoPrice == CarrotPrice);
        System.out.println("TommoatoPrice == CarrotPrice : " +result);

        //not equal to
        result = (TommoatoPrice != CarrotPrice);
        System.out.println("TommoatoPrice != CarrotPrice : " +result);

    }
    //Logical Operators in Java
    static void LogicalOperaters(String Name, String Name2)
    {
        //Logical AND
        boolean result = (Name == "Vicky") && (Name2 == "Vicky");
        System.out.println("Name == Vicky && Name2 == Vicky : " +result);

        //Logical OR
        result = (Name == "Vicky") || (Name2 == "Vicky");
        System.out.println("Name == Vicky || Name2 == Vicky : " +result);

        //Logical NOT
        result = !(Name == "Vicy");
        System.out.println("!(Name == Vicky) : " +result);
    }
    //Bitwise Operators in Java
    static void BitwiseOperaters(int a, int b)
    {
        // a = 5;  // 0101 in binary
        //b = 3;  // 0011 in binary
    
            System.out.println("Bitwise AND: " + (a & b));  // 1  (0001)
            System.out.println("Bitwise OR: " + (a | b));   // 7  (0111)
            System.out.println("Bitwise XOR: " + (a ^ b));  // 6  (0110)
            System.out.println("Bitwise NOT (~a): " + (~a)); // -6
            System.out.println("Left Shift (a << 1): " + (a << 1));  // 10  (1010)
            System.out.println("Right Shift (a >> 1): " + (a >> 1)); // 2  (0010)
    }

     
    

    public static void main(String []args)
    {
        //invokig all the methods at the main method 
        //ArithmaticOperater(2, 2);
        //Assignmentoperater(2);
        //RelationalOperater(50, 50);
        //LogicalOperaters("Vicky", "Vicky");
        BitwiseOperaters(5, 3);
    }
}
