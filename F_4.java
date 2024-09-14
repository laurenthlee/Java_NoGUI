import javax.swing.JOptionPane;
class  F_4
{		
	public static void f_max(int x,int y) {
		if(x>y){
			System.out.println(x);
			JOptionPane.showMessageDialog(null,"Input is :"+x);
		}else{
			System.out.println(y);
			JOptionPane.showMessageDialog(null,"Input is :"+y);
		}
	}
	
	public static void main(String[] args) {
		int n1,n2;
		String Input1,Input2;
		Input1 = JOptionPane.showInputDialog("Input1 is :");
		n1 = Integer.parseInt(Input1);
		Input2 = JOptionPane.showInputDialog("Input2 is :");
		n2 = Integer.parseInt(Input2);
		f_max(n1,n2);
		System.exit(0);
	}
}