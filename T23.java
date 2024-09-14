import javax.swing.*;
class  T23{
	public static void main(String[] args) {
		double x;
		F_Result m = new F_Result(20,35,28);
		x = m.showAvg();
		System.out.println("Average : "+x);
	}
}

class F_Result{
	private static int m,n,o;
	F_Result(int x,int y,int z) {
		n=x; m=y; o=z;
	}

	public static double showAvg() {
		return (double)(n+m+o)/3;
	}
}