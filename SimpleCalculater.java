class calculater
{
    static void Dummydata()
    {
     
    }

    static int calculater1(int NUMBER1,int NUMBER2)
    {
        int results = NUMBER1 + NUMBER2 ;
        int SUBTRACTION = NUMBER1 - NUMBER2;
        int MULTIPLICATION = NUMBER1 * NUMBER2;
        int DIVISION = NUMBER1 / NUMBER2;
        int MODULUS = NUMBER1 % NUMBER2;
        System.out.println("Namskara Bengalauru " + results);
        return results; 
    }
              
    
    public static void main(String []args)
    {
        calculater1(2,3);

    }
}