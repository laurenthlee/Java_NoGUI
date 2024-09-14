import javax.swing.JOptionPane;

class F_8 {		
	// Method to find the maximum of two numbers
	public static int f_max(int x, int y) {
		if (x > y)
			return x;
		else
			return y;
	}

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Input is:");
		int a = Integer.parseInt(input);
		JOptionPane.showMessageDialog(null, "Input is: " + a);

		// Variables for maximum calculation
		int n1 = 65, n2 = 82, n3 = 52;
		int x = f_max(f_max(n1, n2), n3);
		System.out.println("Max is: " + x);

		// Exit the program after all tasks are complete
		System.exit(0);
	}
}
