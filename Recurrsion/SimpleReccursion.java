public class SimpleReccursion 
{
    /**
     * @param count
     * @return
     */
    static int Function1(int count)

     
    
    {
        //Dont call funtion at the top becuse if we call the f() there will get stack over flow
        //to avoid this we need to use stop infinate loop use conditon whrere to stop
        //Function1(count);
        
        //This is the condition to stop the recursion\
        //The best practice  would be before the funtion we need to  intialization of the variable as well as braek condition...
        if (count >=2)
        {
        return count;   
        }

        count ++;
        System.out.println(count);
        

        
        // calling funtion funtion itself this is known as recursion
        //1st calling itself
        Function1(count);

        //The below print statement which reverse the data 
        System.out.println(count);
        
        //2nd calling itself
        //Function1(count);
       
        //This would be the retun value of the function
        return count;
    }

    public static void main(String []args)
    {
        Function1(0);//invoking the funtion at the main method
    }

}
