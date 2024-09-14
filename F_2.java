import javax.swing.JOptionPane;
class  F_2
{		
	public static char f_grade(int x) {
		if(x<50)
			return 'F';
		else if(x<=60)
			return 'D';
		else if(x<=70)
			return 'C';
		else if(x<=80)
			return 'B';
		else
			return 'A';
	}
	public static void main(String[] args) {
		int n1;
		String Input1;
		Input1 = JOptionPane.showInputDialog("Input1 is :");
		n1 = Integer.parseInt(Input1);
		char g = f_grade(n1);
		JOptionPane.showMessageDialog(null,"Input is :"+g);
		System.exit(0);
	}
}