import javax.swing.JOptionPane;

class F_11 {
	public static void plus(int x, int y, int z) {
		System.out.println("Sum is: " + (x + y + z));
		System.exit(0);
	}

	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter first number:");
		String input2 = JOptionPane.showInputDialog("Enter second number:");
		String input3 = JOptionPane.showInputDialog("Enter third number:");

		int n1 = Integer.parseInt(input1);
		int n2 = Integer.parseInt(input2);
		int n3 = Integer.parseInt(input3);
		plus(n1, n2, n3);
	}
}
