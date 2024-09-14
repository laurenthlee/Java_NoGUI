import javax.swing.JOptionPane;
class  F_5
{		
	public static void main(String[] args) {
		int sum=2561,m;
		m=sum/1000; sum%=1000;System.out.println("1000="+m);
		m=sum/500;sum%=500;	System.out.println("500="+m);
		m=sum/100;sum%=100;	System.out.println("100="+m);
		m=sum/50;sum%=50;	System.out.println("50="+m);
		m=sum/20;sum%=20;	System.out.println("20="+m);
		m=sum/10;sum%=10;	System.out.println("10="+m);
		m=sum/5;sum%=5;		System.out.println("5="+m);
		m=sum/2;sum%=2;		System.out.println("2="+m+"\n1="+sum);
	}
}