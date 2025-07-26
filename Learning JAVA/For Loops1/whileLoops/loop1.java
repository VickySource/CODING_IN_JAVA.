package  whileLoops;

public class loop1 
{
    public static void main(String []args)
    {
        int count = 0;
        //This while loop if condithion Satisfy then go for excute 
        //Otherwise it will exit from the for loop
        while (count <= 10)
        {   
            System.out.println(count);
            count++;  
        }


        // The Main thing in do-while loop it first think Do block of the code
        // Then checks the condition
        // one Pros here it excutes atleast one even condition not satisfy
        // The condition whih we written at the last
        do
        { 
            count += 1;
            System.out.println(count);
        }
        while (count <= 10);
        
    }    
}
