/*
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
Team 3
CS304-2
Automated Grade Book


This class will create a Student object. This object will be used to store the various grades
for a student. It will have a seperate array for tests, assignments and exams.
---------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------
*/
public class Student
{
	//There will be an array for each students tests, assignments, and exams. The size of 
	//arrays will be determined when a new semester is setup.						
	private int [] tests, assignments, exams;

	private String firstName, lastName;
	private int studentNumber;
	        
	//____Constructor________________________________________________________________________
	//This will set the various arrays(tests, assignments, exams) to the appropriate sizes
	public Student(int testQuantity, int assignmentQuantity, int examQuantity)
	{
		tests = new int [testQuantity];
		assignments = new int [assignmentQuantity];
		exams = new int [examQuantity];	
	}
	
	//____setFirstName_______________________________________________________________________
	//This will set the first name for each student.
	public void setFirstName(String first)
	{
		firstName = first;
	}
	
	//____getFirstName_______________________________________________________________________
	//This will return the first name for each student.
	public String getFirstName()
	{
		return firstName;
	}
	
	//____setLastName________________________________________________________________________
	//This will set the last name for each student.
	public void setLastName(String last)
	{
		lastName = last;
	}
	
	//____getLastName________________________________________________________________________
	//This will return the last name for each student.
	public String getLastName()
	{
		return lastName;
	}
	
	//____setStudentNumber___________________________________________________________________
	//This will set the student number for each student.
	public void setStudentNumber(int idNum)
	{
		studentNumber = idNum;
	}
	
	//____getStudentNumber___________________________________________________________________
	//This will return the student number for each student.
	public int getStudentNumber()
	{
		return studentNumber;
	}
	
	//____setTestScore_______________________________________________________________________
	//This will set a test score for each student. It will recieve both the test score and 
	//what test number is to be modified. The test numbers range is 0-4.
	public void setTestScore(int testNum, int testScore)
	{
		if(testNum < tests.length  && testNum >= 0)	//makes sure that the test # is in the defined range.
			tests[testNum] = testScore; //sets the test score to the corresponding array index
		else
			System.out.println("!!!Test Number not in range!!!");
	}
	//____getTestScore_______________________________________________________________________
	//This will recieve the desired test number and return that tests score
	//!!!!!!!It is assumed that the test number is within the defined range!!!!!!!!!!!!!!!!!!
	public int getTestScore(int testNum)
	{
			return tests[testNum];
	}
	//____setAssignmentScore_________________________________________________________________
	//This will set a assignment score for each student. It will recieve both the assignment   
	//score and what assignment number is to be modified. The assignment numbers range is 0-6
	public void setAssignmentScore(int assignmentNum, int assignmentScore)
	{
		if(assignmentNum < assignments.length && assignmentNum >= 0)	//makes sure that the assignment # is in the defined range.
			assignments[assignmentNum] = assignmentScore; //sets the assignment score to the corresponding array index.
		else
			System.out.println("!!!Assignment Number not in range!!!");
	}
			
	//____getAssignmentScore_________________________________________________________________
	//This will recieve the desired assignment number and return that assignments score
	//!!!!!!!It is assumed that the assignmnet number is within the defined range!!!!!!!!!!!!
	public int getAssignmentScore(int assignmentNum)
	{
		return assignments[assignmentNum];
	}	
	
	//____setExamScore_______________________________________________________________________
	//This will set a exam score for each student. It will recieve both the exam score and 
	//what exam number is to be modified. The exam numbers range is 0-1.
	public void setExamScore(int examNum, int examScore)
	{
		if(examNum < exams.length && examNum >= 0)	//makes sure that the exam # is in the defined range.
			exams[examNum] = examScore; //sets the exam score to the corresponding array index
		else
			System.out.println("!!!Exam Number not in range!!!");
	}
	//____getExamScore_______________________________________________________________________
	//This will recieve the desired exam number and return that exams score
	//!!!!!!!It is assumed that the exams number is within the defined range!!!!!!!!!!!!!!!!!
	public int getExamScore(int examNum)
	{
		return exams[examNum];
	}	
}