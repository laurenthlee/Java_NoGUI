class  F_1
{		
	public static void f_show(int x,int y,int z){
		System.out.println("Sum"+(float)(x+y+z));
	}
	public static void f_avg(int x,int y,int z){
		System.out.println("Ang is :"+((float)(x+y+z)/3));
	}
	public static void f_max(int x,int y){
		if(x>y)
			System.out.println("Max :"+x);
		else
			System.out.println("Max :"+y);
	}
	public static void f_min(int x,int y){
		if(x<y)
			System.out.println("Min :"+x);
		else
			System.out.println("Min :"+y);
	}
	
	public static void main(String[] args) {
		int n1 = 250, n2 = 30, n3 = 54;
		if(n1 < n2){
			System.out.println("Max = "+n2);
		}else{
			System.out.println("Max = "+n1);
		}
		f_show(n1,n2,n3);
		f_avg(n1,n2,n3);
		f_max(n1,n2);
		f_min(n1,n2);
	}
}