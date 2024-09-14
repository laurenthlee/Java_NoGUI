class  T26{
	public static void main(String[] args) {
		Mix3 m = new Mix3();
		m.f_input(12,25);
		m.f_plus();
		m.f_sub();
		m.f_mul();
	}
}

class Mix{
	protected static int a,b;
	protected static void f_input(int x,int y){
		a=x;
		b=y;
	}
}

class Mix2 extends Mix{
	protected static void f_plus() {
		System.out.println("Show F_plus : "+(a+b));
	}
}

class Mix3 extends Mix2{
	protected static void f_sub() {
		System.out.println("Show F_sub : "+(a-b));
	}
	protected static void f_mul() {
		System.out.println("Show f_mul : "+(a*b));
	}
}