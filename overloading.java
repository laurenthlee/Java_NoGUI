//import javax.swing.*;
class  overloading{
	
	public static void f_avg(double x,double y) {
		System.out.println("Sum 1 is :"+(x+y)/2);
	}
	public static void f_avg(double x,double y,double z) {
		System.out.println("Sum 2 is :"+(x+y+z)/3);
	}

	public static void main(String[] args) {
		f_avg(2.24,5.52);
		f_avg(2.631,5.52,8.45);
	}
}