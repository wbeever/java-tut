import java.util.*;

public class student_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maths, physics, chemistry, english, computersc;
		double finalscore;
		boolean results;
		Scanner marks = new Scanner(System.in);

		do {
			System.out.println("Enter marks for Maths:");
			maths = marks.nextInt();
			System.out.println("Enter marks for Physics:");
			physics = marks.nextInt();
			System.out.println("Enter marks for Chemistry:");
			chemistry = marks.nextInt();
			System.out.println("Enter marks for English:");
			english = marks.nextInt();
			System.out.println("Enter marks for Computersc:");
			computersc = marks.nextInt();

			finalscore = (maths + physics + chemistry + english + computersc) / 5;

			if (finalscore > 90) {
				System.out.println("Excellent!");
			} else if (finalscore > 80) {
				System.out.println("Very Good");
			} else if (finalscore > 70) {
				System.out.println("Good");
			} else if (finalscore > 60) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}
			System.out.println("Any more students?(True or False)");
			results = marks.nextBoolean();
		} while (results); // can also replace the do. must set 'results = true' first.

	}

}
