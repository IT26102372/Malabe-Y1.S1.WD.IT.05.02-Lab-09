import java.util.Scanner;
public class IT26102372Lab9Q4{
	public static double calcFinalMark(int assignmentMark, double examMark){
	
		double finalMarks;
		
		finalMarks = (assignmentMark * 0.30)+(examMark * 0.70);
		
		return finalMarks;
	}
	
	public static char findGrade(double finalMarks){
	
		if(finalMarks >= 75){
			return 'A';
		}
		else if(finalMarks >=60){
			return 'B';
		}
		else if(finalMarks >=50){
			return 'C';
		}
		else {
			return 'F';
		}
	}
	
	public static void printDetails(String[] name, double[] finalMarks, char[] grade){
		System.out.println("Name\tFinal Mark\tGrade");
	
	
	
		for(int stuC = 0; stuC < 5; stuC++){
			System.out.println(name[stuC] +"\t " + finalMarks[stuC]+ "\t\t " + grade[stuC]);
		}
	}
	
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	String[] name = new String[5];
	double[] finalMarks = new double[5];
	int[] assignmentMark = new int[5];
	double[] examMark = new double[5];
	char[] grade = new char[5];
	
	for (int stuC = 0; stuC < 5; stuC++){
	
	System.out.print("Enter Name of student " + (stuC + 1 )+ ":");
	name[stuC]= input.nextLine();
	
	System.out.print("Enter Assignment Mark(out of 100):" );
	assignmentMark[stuC] = input.nextInt();
	
	System.out.print("Enter Exam paper Marks(out of 100):");
	examMark[stuC] = input.nextDouble();
	System.out.print("\n");
	
	finalMarks[stuC] = calcFinalMark(assignmentMark[stuC],examMark[stuC]);
	
	grade[stuC] = findGrade(finalMarks[stuC]);
	
	input.nextLine();
	}
	
	printDetails(name,finalMarks,grade);
	
	}
}
	
