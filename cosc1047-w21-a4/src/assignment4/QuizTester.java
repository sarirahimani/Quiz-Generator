package assignment4;
//We import the scanner
import java.util.Scanner;

public class QuizTester {
	public static void main(String[] args) {
		
		int count=1;
		//Create the scanner object to collect the user's input
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("Creating a five question quiz...");
		//We prompt the user to enter a title and the scanner stores it in the variable title
		System.out.println("Enter a Title:");
		String title=keyboard.nextLine();
		
		//We create a Quiz object and a FillInTheBlank array 
		Quiz exam=new Quiz(5,title);
		FillInTheBlank fitbExam[]=new FillInTheBlank[5];
		FillInTheBlank.setnum();
		System.out.println(FillInTheBlank.getnum());
		/*
		 * We use a for loop to collect all the questions and 
		 * answers for the FillInTheBlank array from the user.
		 * and then we use exam.setQuestion(i, fitbExam[i]);
		 * to set the question and answer in the quiz object. 
		 */
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Enter question number "+count+" : ");
			String question=keyboard.nextLine();
		
			System.out.println("Enter an answer for question "+count+" : ");
			String answer=keyboard.nextLine();
			fitbExam[i]=new FillInTheBlank(question, answer);
			exam.setQuestion(i, fitbExam[i]);
			count++;
		}
		
		//We use printText() and printAnswers() to print the title, the questions and the answers.
		exam.printText();
		exam.printAnswers();
		//we close the Scanner
		keyboard.close();
		
	}
}


