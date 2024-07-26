package assignment4;

/**
 * @author Sahara 
 */

public class Quiz {
	
	private int numQuestions;
	private String title;
	private FillInTheBlank[] quiz;
	
	
	/**
	 * Unargumented Constructor or default 
	 * constructor. Sets numQuestions with 
	 * a default value and title with a 
	 * default title and fills the quiz
	 *  array with nulls.
	 */
	
	 public Quiz(){ 
		 this.numQuestions=5;
		 title="COSC 1047 Midterm W21";
		 quiz=new FillInTheBlank[numQuestions];
		 
		 for(int i=0;i<this.numQuestions;i++) {
			quiz[i]=new FillInTheBlank(null,null);
		}
	}
	 
	 /**
	  * Argumented constructor. Sets numQuestions
	  * and title and fills the quiz array with 5 nulls.
	  * @param numQuestions number of questions, 
	  * which is also the size of the array
	  * @param title the title 
	  */
	 
	 public Quiz(int numQuestions, String title){
		 this.numQuestions=numQuestions;
		 this.title=title;
		 quiz=new FillInTheBlank[numQuestions];
		 
		for(int i=0;i<numQuestions;i++) {
			quiz[i]=new FillInTheBlank(null,null);	 
		}
	 }
	 
	 /**
	  * Copy constructor.
	  * @param in
	  */

	 public Quiz(Quiz in) {
		 numQuestions=in.numQuestions;
		 title=in.title;
		 quiz=new FillInTheBlank[numQuestions];
		 
		 for(int i=0; i<numQuestions;i++) {
			 quiz[i]=new FillInTheBlank(in.getQuestion(i)); 
		 }
	 }
	 
	 /**
	  * Mutator
	  * Sets the title
	  * @param title
	  */
	 
	 public void setTitle(String title){this.title=title;}
	 
	 /**
	  *accesor
	  * Gets the title.
	  * @return title
	  */
	 
	 public String getTitle(){return title;}
	 
	/**
	 * Mutator 
	 * Sets the question and the answer
	 * and checks if the index numbers are 
	 * appropriate and if it is not it
	 * does nothing.
	 * @param index index of the question
	 * @param questionIn the question that 
	 * will be set
	 */
	 
	 public void setQuestion(int index, FillInTheBlank questionIn){
		if(index<numQuestions && index>=0)
			quiz[index]=new FillInTheBlank(questionIn);
	}
	 
	/**
	 * Accesor 
	 * Gets the question and the 
	 * answer and checks if the index numbers are 
	 * appropriate and if it is not it
	 * does nothing.
	 * @param index index of the question
	 * @return the question and the answer 
	 * or null
	 */
	 
	public FillInTheBlank getQuestion(int index){
		
		if(index<numQuestions && index>=0) {
			return new FillInTheBlank(quiz[index]);
		}else {
			return null;
		}
		
	}
	/**
	 * displays the title of the test and 
	 *  then all the questions with question 
	 *  numbers 
	 */
	
	 public void printText(){
		 int count=1;
		 String theQuestions="";
		 
		 for(int i=0;i<numQuestions;i++) {
			 theQuestions+=(count)+") "+quiz[i].getQuestion()+"\n";
			 count++;
		 }
		 
		 System.out.println("The title of the quiz is: "+title+"\n The questions are:\n"+theQuestions);
	 }
	 
	/**
	 * displays the answers with question numbers.
	 * if a question null it does not print anything. 
	 */
	 
	 public void printAnswers(){
		 int count=1;
		 String theAnswers="";
		 
		 for(int i=0;i<numQuestions;i++) {
			 
			 if(quiz[i].getAnswer()!=null) {
				 theAnswers+=(count)+")"+quiz[i].getAnswer()+"\n";
			 }
			 
			 count++;
		 }
		 System.out.println("The answers are:\n"+theAnswers+"\n");
	 }
	 
	 /**
	  * Simple toString to print the title and number of Questions
	  */
	 
	 public String toString(){ return "The Title is: "+title+"\n"+"The number of questions is: "+numQuestions;}

}


