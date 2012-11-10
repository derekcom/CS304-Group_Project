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
    
   
/*Method where data will be entered from the uesr input. This method will be
  prompted for the instructor to create a new semester*/
    public void SemesterSetUp()
    {
        
           Scanner K = new Scanner(System.in);
        
           System.out.print("Enter Semester Name: "); 
           String Name = K.nextLine();
    
            System.out.print("Enter number of Students: ");
            int Nstudents = K.nextInt();
				       
				System.out.print("Enter Number of Tests: ");
            int Ntests = K.nextInt();
				
				//Check if number of tests is in the range of 0 to 4
				if(Ntests < 0 || Ntests > 4) 
				{  
				   //if not in range ask user to enter right number
				   System.out.println();
					System.out.println("Please enter a number of tests in the range of 0 to 4! ");
					System.out.println();
					System.out.print("Enter Number of Tests: ");
               Ntests = K.nextInt(); //overrides the wrong number 

				}
				
				
            System.out.print("Enter Number of Assigmentst: ");
            int Nassignments = K.nextInt();
				
				//Check if number of assignments is in the range of 0 to 6
				if(Nassignments < 0 || Nassignments > 6)
				{  
				   //if not in range ask user to enter right number
				   System.out.println();
					System.out.println("Please enter a number of assignments in the range of 0 to 6! ");
					System.out.println();
					System.out.print("Enter Number of Assignments: ");
               Nassignments = K.nextInt(); //overrides the wrong number 

				}

             
            System.out.print("Enter Number of Exams: ");
            int Nexam = K.nextInt(); 
            System.out.println();
				
				//Check if number of exams is in the range of 0 to 1
				if(Nexam < 0 || Nexam > 1)
				{
				   //if not in range ask user to enter right number
				   System.out.println();
					System.out.println("Please enter a number of exams in the range of 0 to 1! ");
					System.out.println();
					System.out.print("Enter Number of exams: ");
               Nexam = K.nextInt(); //overrides the wrong number 

				}
    
     
        /*variables above will be passed to class student to set the size of 
          arrays for assigments, exams, and tests on class student*/
        Student S = new Student(Ntests,Nassignments,Nexam);
               
        
    }

    
}
	


