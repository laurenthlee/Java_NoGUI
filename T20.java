import javax.swing.*;
class  T20{
	public static void main(String[] args) {
		F_rectangle v = new F_rectangle(12,20);
		v.display();
	}
}

class F_rectangle{
	private static int num;
	//Constructure
	F_rectangle(int x,int y){
		num = (y*x);
	}


	public static void display() {
		System.out.println("Area of rectangle : "+num);
	}
}