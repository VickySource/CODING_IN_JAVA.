public class Conditions 
{
     //There are six types of conditional statements in Java:
    //1. if statement
    //2. if-else statement
    //3. if-else-if ladder
    //4. nested if statement
    //5. switch statement
    //6. conditional operator (ternary operator)
    
    
    //if statement

    static void getPersonAge(int age) {
        if (age >= 18) 
        {
           System.out.println("You are eligible to vote");
        } 
     }
     //2. if-else statement
 
     static void IsNumberPositive(int nmuber)
     {
        if (nmuber >= 0) 
        {
             System.out.println("" + nmuber + " is positive Number");    
        }
        else 
        {
             System.out.println("" + nmuber + " is negative Number");    
        }
     }
      //3. if-else-if ladder
  
     static void  getStudentClass(int var0) 
     {
        System.out.println("Your Marks is: " + var0);
        if (var0 >= 70) 
        {
           System.out.println("You got a distinction in the result");
        } else if (var0 >= 60)
     {
           System.out.println("You got a first class in the result");
        } else if (var0 >= 50) 
        {
           System.out.println("You got a second class in the result");
        } else if (var0 >= 40) 
        {
           System.out.println("You got a third class in the result");
        } else 
        {
           System.out.println("You are failed in the result");
        }
  
     }
  
 
     //4. nested if statement. 
     //it is used to check multiple conditions. must as true 
     //Avoid using nested if statements as much as possible.
     //instead use if-else-if ladder or switch statement.
     //under the is i have just used if statement with respect to the bitwise operator.
     static void getPremiumCard(int var0, int var1, int var2) {
        if (var0 >= 18 && var1 >= 50000 && var2 >= 700) 
        {
           System.out.println("You are eligible for premium card");
        }
  
     }
     
     static void getMonth(int month) {
         String Month;
         switch (month) {
            case 1:
            Month = "January";
               break;
            case 2:
            Month = "February";
               break;
            case 3:
            Month = "March";
               break;
            case 4:
            Month = "April";
               break;
            case 5:
            Month = "May";
               break;
            case 6:
            Month = "June";
               break;
            case 7:
            Month = "July";
               break;
            case 8:
            Month = "August";
               break;
            case 9:
            Month = "September";
               break;
            case 10:
            Month = "October";
               break;
            case 11:
            Month = "November";
               break;
            case 12:
            Month = "December";
               break;
            default:
            Month = "Invalid month";
         }
   
         System.out.println(Month);
      }
 
      //6. conditional operator (ternary operator)
 
      static void getMax(int num1, int num2) 
      {
         int max = (num1 > num2) ? num1 : num2;
         System.out.println("Maximum number is: " + max);
      }
      
      //This is an another type of (ternary operator)
      //if the given condition is satisfied then it will return the first value otherwise it will return the second value.
      static void FindEligibleVoting(int age) 
      {
          String message = (age >= 18) ? "You are eligible to vote" : "You are not eligible to vote";
          System.out.println(message);
          //return message;
      }
  
     public static void main(String[] var0) 
     {
        //getPremiumCard(19, 12222, 720);
        //System.out.println("You are eligible for premium card");
        //getMax(20, 20);
        FindEligibleVoting(0);    
    }
       
}
   
    
    
 

