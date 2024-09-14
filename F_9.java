import javax.swing.JOptionPane;

class F_9 {
	public static void f_grade(int x) {
		if(x<50)
			System.out.println("Fall");
		else if(x<75)
			System.out.println("pass");
		else
			System.out.println("good");
	}
	public static void main(String[] args) {
		f_grade(56);	
	}
}
