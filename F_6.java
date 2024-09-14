import javax.swing.JOptionPane;

class F_6 {		
	// Method to calculate average
	public static double f_avg(int x, int y) {
		double avg = (double)(x + y) / 2;
		return avg;
	}

	// Method to determine grade based on score
	public static char f_grade(int x) {
		if (x < 50)
			return 'F';
		else if (x < 60)
			return 'D';
		else if (x < 70)
			return 'C';
		else if (x < 80)
			return 'B';
		else
			return 'A';
	}

	public static void main(String[] args) {
		int n1 = 25, n2 = 30;
		double a = f_avg(n1, n2);
		System.out.println("Average: " + a);
		System.out.println("Grade for 25: " + f_grade(25));
	}
}
