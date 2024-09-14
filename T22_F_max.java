class F_max{
	private static int Max,Min;
	private static int m,n;
	
	F_max(int x,int y) {
		if(x>y){
			Max = x;
			Min = y;
		}else{
			Max = y;
			Min = x;
		}
		n=x; m=y;
	}

	public static void showMax() {
		System.out.println("Max is : "+Max);
	}
	public static void showMin() {
		System.out.println("Min is : "+Min);
	}
	public static void showAvg() {
		System.out.println("Average is : "+(double)(n+m)/2);
	}
}