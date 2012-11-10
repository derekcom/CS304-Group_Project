import java.util.Scanner;

public class MainTester
{
	public static void main( String[] args)
	{   
            
        SetUpSemester S = new SetUpSemester();
        S.SemesterSetUp();
		  System.out.println();
        System.out.println("Semester Name: " + S.getSemesterName());
	  
        }

}
