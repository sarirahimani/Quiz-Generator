package assignment4;

/**
 * This is a fill in the blank quiz
 * @author Aaron
 */

public class FillInTheBlank {

	private String question;
	private String answer;
	private static int number;
	
	
	/**
	 * Argumented constructor
	 * @param q the question 
	 * @param a the answer 
	 */
	
	FillInTheBlank(String q, String a){
		setQuestion(q);
		setAnswer(a);
	}
	
	/**
	 * Argumented copy constructor
	 * @param in a FillInTheBlank object
	 */
	
	FillInTheBlank(FillInTheBlank in){
		question = in.question;
		answer = in.answer;
	}
	
	/**
	 * Sets the question
	 * @param q the question 
	 */
	
	public void setQuestion(String q){
		question = q;
	}
	
	/**
	 * Sets the answer
	 * @param a the answer
	 */
	
	public void setAnswer(String a){
		answer = a;
	}
	
	/**
	 * Acessor for question
	 * @return the question
	 */
	
	public String getQuestion(){ return question; }
	
	/**
	 * Accessor for answer
	 * @return the answer
	 */
	public static void setnum() {
		number=5;
	}
	public static int getnum() {
		return number;
	}
	public String getAnswer(){ return answer; }
	
	/**
	 * toString to print the question and answer easily
	 */
	
	public String toString(){
		return "FillInTheBlank[Question:\"" + question + "\", Answer:\"" + answer + "]"; 
	}
}

