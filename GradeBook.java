import java.util.Scanner; 

public class GradeBook {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		setScores scores = new setScores(); 
		
		
		System.out.println("Welcome to the CS112 gradebook? ");
		System.out.format("%10s %10s %10s %10s\n", " 1. Calculus \n", "2. Discrete Mathematics \n", "3. Biology \n", "4. Computer Science \n");
		int subject = input.nextInt();
		
		switch(subject) {
		
		case 1: 
			System.out.println("Welcome to Calculus! Good luck staying alive this year ");
			scores.setQuizScore();
			scores.setMidtermScore();
			scores.setFinalScore();
			scores.overallScore();
			scores.letterGrade(); 
			scores.writeOutput();
			//System.out.println(scores.toString());   prints all scores out using the toString method
			break;
			
		case 2: 
			System.out.println("Welcome to Discrete Mathematics! This will not make any sense ");
			scores.setQuizScore();
			scores.setMidtermScore();
			scores.setFinalScore();
			scores.overallScore();
			scores.letterGrade(); 
			scores.writeOutput();
			break;
			
		case 3: 
			System.out.println("Welcome to Biology! Where haters hate and Crisprs Crispate");
			scores.setQuizScore();
			scores.setMidtermScore();
			scores.setFinalScore();
			scores.letterGrade(); 
			scores.writeOutput();
			break;
			
		case 4: 
			System.out.println("01010111 01100101 01101100 01100011 01101111 01101101 01100101 00100000 01110100 01101111 00100000 01000011 01101111 01101101 01110000 01110101 01110100 01100101 01110010 00100000 01010011 01100011 01101001 01100101 01101110 01100011 01100101");
			scores.setQuizScore();
			scores.setMidtermScore();
			scores.setFinalScore();
			scores.overallScore();
			scores.letterGrade(); 
			scores.writeOutput();
			
			
		
		}
		

	}

}
