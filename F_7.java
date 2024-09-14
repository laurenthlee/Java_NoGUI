import javax.swing.JOptionPane;

class F_7 {		
	public static int f_max(int x,int y) {
		if(x>y)
			return x;
		else
			return y;
	}

	public static void main(String[] args) {
		int n1,n2,n3;
		String Input1,Input2;
		Input1 = JOptionPane.showInputDialog("Input1 is :");
		n1 = Integer.parseInt(Input1);
		Input2 = JOptionPane.showInputDialog("Input2 is :");
		n2 = Integer.parseInt(Input2);
		JOptionPane.showMessageDialog(null,"Input is :"+f_max(n1,n2));
		System.exit(0);
	}
}
