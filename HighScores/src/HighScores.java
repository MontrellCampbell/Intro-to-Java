import java.util.Scanner;

public class HighScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int input = 0;
		int numScores = 0;
		
		while (input != 999)
		{
			System.out.println("Please Enter a score (999 to quit): ");
			input = scan.nextInt();
			
			if (input <= 9)
			{
				numScores++;
			}
			
		}
		
		System.out.println("There were " + numScores + " high scores");

	}

}
