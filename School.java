class School 
{
    public static void main (String []args)
{
    String Studentname =getTopperNameForSubjectGrade(2, "Maths");
    // System.out.println(Studentname);
    Printdetails(1);
}




//Who is the Topper
//which subject
//which grade
//reponse name of the Student

static String getTopperNameForSubjectGrade(int grade , String Subject)

{
    //Dummy implementation
    String name = "Raj";
    return name;
}
static int[] getTotalCountStudentsBoysandGirls(int Studentid)
{
    //The first index is showing boys Data and THE second Will be as present girls
    int[] result = {20,30};
    return result;
}
static void Printdetails(int Studentid)
{
    String name = "Raj";
    int age = 18;
    int grade = 10;
    double cgpa = 9.5;
    boolean isRegularToSchool = true;   

    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Grade: "+grade);
    System.out.println("CGPA: "+cgpa);
    System.out.println("Is Regular to School: "+isRegularToSchool);
     
}




}