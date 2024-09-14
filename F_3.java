import javax.swing.JOptionPane;

class F_3 {
	public static int f_max(int x, int y) {
		if (x > y)
			return x;
		else
			return y;
	}
	
	public static void f_max(int z) {
		System.out.println("Sum is: " + z);
	}

	public static void main(String[] args) {
		int n1 = 10, n2 = 20, n3 = 30;
		String Input1, Input2;
		Input1 = JOptionPane.showInputDialog("Input1 is:");
		n1 = Integer.parseInt(Input1);
		Input2 = JOptionPane.showInputDialog("Input2 is:");
		n2 = Integer.parseInt(Input2);

		int max = f_max(n1, n2);
		JOptionPane.showMessageDialog(null, "Max is: " + max);
		System.exit(0);

		f_max(n1 + n2 + n3);
	}
}
