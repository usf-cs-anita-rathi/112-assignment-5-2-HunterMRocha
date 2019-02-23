import java.util.Scanner; 

public class setScores {
	
	Scanner input = new Scanner(System.in);
	public double quiz = 0; 
	public double midterm = 0; 
	public double finalExam = 0; 
	public double overall = 0; 
	public String letterGrade = ""; 
	
	
	//prints out all the grades
	public void writeOutput() {
		System.out.format("Your quiz average is: %.2f\n", quiz);
		System.out.format("Your midterm average is: %.2f\n", midterm);
		System.out.println("Your final average is: " + finalExam);
		System.out.format("Your overall grade is a: %.2f\n",  overall);
		System.out.println("Which equates to a "+ letterGrade + " in the class");
	}
	
	//different way to print out all the scores
	//to use this method add "scores.toString();" to one of the cases in main class
	public String toString() {
		return ("Quiz Average: "+ quiz + " Midterm Average: " + midterm + " Final Exam: " + finalExam + " Overall Grade" + overall + letterGrade);
		
	}
	
	
	//asks the user for their 3 score, converts it to a percentage, then returns it 
	public double setQuizScore() {
		for(int i = 1; i<= 3; i++ ) {
			System.out.println("Enter a quiz " + i + " score: [0-10 points]");
			double score = input.nextInt();
			quiz += score; 
		}
		quiz = ((quiz/3)*.1)*100;
		return quiz;	
	}
	
	
	//asks user for their midterm score, converts it to a percentage, then returns it
	public double setMidtermScore() {
		System.out.println("Enter a midterm score: [0-100 points]");
		double score = input.nextInt();
		midterm += score;	
		return midterm; 
	}
	
	//asks user for their final grade, weighs it, then returns it
	public double setFinalScore() {
		System.out.println("Enter final exam score: [0-100]");
		double FinalExam = input.nextInt(); 
		finalExam += FinalExam; 
		return finalExam; 
	}
	
	//creates 3 local variables so the main variables don't change change, weigh them all, and add them to the overall variable then return it
	public double overallScore() {
		double quiz1, midterm1,finalExam1; 
		quiz1 = quiz*.25;
		midterm1 = midterm*.35;
		finalExam1 = finalExam*.40;
		overall = quiz1 + midterm1 + finalExam1; 
		return overall; 
	}
	
	//checks user overall grade and returns letter grade equivalent to their grade
	public String letterGrade() {
		if (overall >= 90) {
			letterGrade = "A"; 
		}else if(overall >= 80){
			letterGrade = "B";
		}else if(overall >= 70) {
			letterGrade = "C";
		}else if(overall >= 60) {
			letterGrade = "D";
		}else {
			letterGrade = "F"; 
		}
		return letterGrade;
		
	}

	

	

}
