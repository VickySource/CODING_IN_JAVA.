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
        int answer = totalScore;
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
    public static void main(String []args)
    {
        //ArithmaticOperater(2, 2);
        //Assignmentoperater(2);
        RelationalOperater(50, 50);
    }
}
