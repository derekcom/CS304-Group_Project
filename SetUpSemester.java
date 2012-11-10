/*
*********************************************************************
*								     *				
*                           Team 3                                   *
*                           CS304-2                                  *
*                     Automated Grade Book			     *												 
*			                                             *
*                     Set Up Semester Class                          *
*                                                                    *
*   This class sets up a new semsester for the Automated Grade Book. *
*   It ask the instructor to enter Semester's or term's Name.        *
*   For example, Fall 2012 or Summer 2012 etc. It also ask him for   *
*   number of students, number of assignments, number of tests,      *
*   and number of exams to be entered for the semester being created.*
**********************************************************************  
*/

import java.util.Scanner;



public class SetUpSemester
{
   
    //Private variables for the class
    private String SemesterName;
    private int NumberAssignments;
    private int NumberStudents;
    private int NumberTests;
    private int NumberExams;
    
    
    
    public SetUpSemester()
    {

    }
    
    
    /*Constructor with arguments*/
    public SetUpSemester(String SemesterN,
                         int NAssignment, int NStudent, int NTest, int NExam)
    {

       
        SemesterName = SemesterN; 
        NumberAssignments = NAssignment;
        NumberStudents = NStudent;
        NumberTests = NTest;
        NumberExams = NExam;

            
    }
   
/*Method where data will be entered from the uesr input. This method will be
  prompted for the instructor to create a new semester*/
    public void SemesterSetUp()
    {
        
        Scanner K = new Scanner(System.in);
        
        System.out.print("Enter Semester Name:");
        String Name = K.nextLine();
        setSemesterName(Name); //semester name will be set 
       
  /*Do while loop to loop through data entry.*/  
     
        do
        {  
            System.out.print("Enter number of Students: ");
            int Nstudents = K.nextInt();
            setNumberStudents(Nstudents); //set number of students
            
				System.out.print("Enter Number of Tests: ");
            int Ntests = K.nextInt(); 
            setNumberTests(Ntests); //set number of tests

            System.out.print("Enter Number of Assigmentst: ");
            int Nassignments = K.nextInt();
            setNumberAssignments(Nassignments); //set number of assignments
                       
            System.out.print("Enter Number of Exams: ");
            int Nexam = K.nextInt(); 
            setNumberExams(Nexam); //set number of exams
            System.out.println();
            //the user will have the option to keep entering data
            System.out.print("Would you like to continue entering data? (Y/N) ");
         
            /*if the answer is yes go back to the beginning of the while loop
              else go to next step*/ 
        }while("Y".equalsIgnoreCase(K.next().trim())); 
        
       //get number of assignments and assign them to variable assignmentQuantity
        int assignmentQuantity = getNumberAssignments();
       //get number of tests and assign them to variable testQuantity
        int testQuantity = getNumberTests();
       //get number of exams and assign them to variable examQuantity
        int examQuantity = getNumberExams();
     
        /*variables above will be passed to class student to set the size of 
          arrays for assigments, exams, and tests on class student*/
        Student S = new Student(testQuantity,assignmentQuantity, examQuantity);
               
        
    }

    
//setters and getters for class SetUpSemester
    public String getSemesterName()
    {
        return SemesterName;
    }

    private void setSemesterName(String SName)
    {
        SemesterName = SName;
    }
    
     public int getNumberAssignments()
    {
        return NumberAssignments; 
    }
    
    
     public void setNumberAssignments(int NAssignment)
    {
        NumberAssignments = NAssignment; 
    }
    
     
     public int getNumbeStudents()
    {
        return NumberAssignments;
    }
     
     public void setNumberStudents(int NStudents)
    {
        NumberStudents = NStudents; 
    }
     
     
     public int getNumberTests()
    {
        return NumberTests;
    }
     
    
    public void setNumberTests(int NTests)
    {
        NumberTests = NTests; 
    }
    
    public int getNumberExams()
    {
        return NumberExams;
    }
    
    public void setNumberExams(int Nexams)
    {
        NumberExams = Nexams;
    }
   
    
  
}
	


