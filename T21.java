import javax.swing.*;
class  T21{
	public static void main(String[] args) {
		F_rectangle v = new F_rectangle();
		v.display(12,20);
	}
}

class F_rectangle{
	public static void display(int x,int y) {
		System.out.println("Area of rectangle : "+(x*y));
	}
}