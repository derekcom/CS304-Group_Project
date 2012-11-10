/*
**********************************************************************
*																							*				
*                           Team 3                                   *
*                           CS304-2                                  *
*                     Automated Grade Book									*												 
*																							*
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
		        
		Scanner kbd = new Scanner(System.in);
		int numStudents, numTests, numAssignments, numExams;
		  
		System.out.print("Enter Semester Name: "); 
		String semesterName = kbd.nextLine();
		 
		System.out.print("Enter number of Students: ");
		numStudents = kbd.nextInt();


		//Get the number of tests________________________________________________
		//this will loop until the input is within the given range
		do{
			System.out.print("Enter Number of Tests: ");
			numTests = kbd.nextInt();
			if(numTests < 0 || numTests > 4) //range is 0-4
			{  
				//if not in range ask user to enter right number
				System.out.println("Please enter a number of tests in the range of 0 to 4! ");
			}
			}while(numTests < 0 || numTests > 4); //range is 0-4
		
		//Get the number of assignments___________________________________________
		//this will loop until the input is within the given range
		do{
			System.out.print("Enter Number of Assigments: ");
			numAssignments = kbd.nextInt();
			if(numAssignments < 0 || numAssignments > 6) //range is 0-6
			{  
				//if not in range ask user to enter right number
				System.out.println("Please enter a number of assignments in the range of 0 to 6! ");
			}
		}while(numAssignments < 0 || numAssignments > 6);//range is 0-6
		
		//Get the number of exams_________________________________________________
		//this will loop until the input is within the given 
		do{
			System.out.print("Enter Number of Exams: ");
			numExams = kbd.nextInt();
			if(numExams < 0 || numExams > 1) //range is 0-1
			{  
				//if not in range ask user to enter right number
				System.out.println("Please enter a number of exams in the range of 0 to 6! ");
			}
		}while(numExams < 0 || numExams > 1);//range is 0-1
			 
		  
		

		//this will create an array of the Student object. the length will be equal to the number
		//of students
		Student [] gradeBook = new Student [numStudents];
		
		//this loop will intilialize each item in the gradeBook array.
		/*variables above will be passed to class student to set the size of 
		arrays for assigments, exams, and tests on class student*/
		for(int x = 0; x < gradeBook.length; x++)
			gradeBook[x] = new Student(numTests, numAssignments, numExams);
			
			
			
			
			
			
		//********************* a little testing and showing how this will work **************************************
		//************************************************************************************************************
		//at the moment all the arrays contain nothing but zeros
		gradeBook[2].setTestScore(0, 99); // for the student in index 2... this sets the test in index 1 to 99.
		System.out.println(gradeBook[2].getTestScore(0));	//should display 99
		System.out.println(gradeBook[3].getTestScore(0));	//should display 0
		
	}
}
	


