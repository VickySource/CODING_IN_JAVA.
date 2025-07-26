public class sample1 
{
    //Classify the Student into FirstClass,SecondClass And  Distinction
    
    
    static String getStudentRank(int Percentage)
    {
        if (Percentage >= 50)
        {
            return "SecondClass";
        }
        else if (Percentage >= 60)
        {
            return "FirstClass";
            //Returns the Firstclass
        }
        else if (Percentage >= 75)
        {
            return "Distinction";
        }
           else if (Percentage >= 35)
        {
            return "Third class";
        }
       
        System.out.println("You are failed");
        return "faild";
    }

    public static void main(String [] args)
    {
        int Percent = 54;
        getStudentRank(Percent);
        System.out.println(Percent);
    }
}
