import javax.swing.*;
class  T24{
	public static void main(String[] args) {
		F_Grade m = new F_Grade("Pichet",74);
		m.FindGrade();
	}
}

class F_Grade{
	private static String n;
	private static char m;

	F_Grade(String x,int y) {
		n = x;
		if(y<50)			m = 'F';
		else if(y<=60)		m = 'D';
		else if(y<=70)		m = 'C';
		else if(y<=80)		m = 'B';
		else				m = 'A';
	}

	public static void FindGrade() {
		System.out.println("Student Name : "+n+" Grade "+m);
	}
}