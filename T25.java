import javax.swing.*;
class  T25{
	public static void main(String[] args) {
		F_Gpa m = new F_Gpa(3,2,4,2,3,1);
		m.F_showGpa();
	}
}

class F_Gpa{
	private static double sum,sum1;

	F_Gpa(int x,int y,int x1,int y1,int x2,int y2) {
		sum = (double)((x*y)+(x1*y1)+(x2*y2))/(y+y1+y2);
	}

	public static void F_showGpa() {
		System.out.println("Student Gpa : "+sum);
	}
}