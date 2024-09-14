import javax.swing.*;
class  T16{
	public static void main(String[] args) {
		System.out.println("Hello Mrs :");
		boolean CheckERROR;
		do{
			try{
				CheckERROR = true;
				T17 x = new T17(10);
				T17 y = new T17();
				
				String input1 = JOptionPane.showInputDialog("Enter Number 1 :");
				int n1 = Integer.parseInt(input1);
				String input2 = JOptionPane.showInputDialog("Enter Number 2 :");
				int n2 = Integer.parseInt(input2);

				x.run(n1,n2);
				x.walk(n1,n2);
				y.run(n1,n2);
				y.walk(n1,n2);
				x.num=110;

			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Error2 :"+e);
				CheckERROR = false;
			}
		}while(CheckERROR);
		System.exit(0);
	}
}

class T17{
	
	//Constructure
	T17(){
		System.out.println("Constructure !");
	}

	//Overloding
	T17(int x){
		System.out.println("Constructure X ! "+x);
	}

	int num;
	public static void run(int x,int y) {
		System.out.println("Run : "+(x+y));
	}
	public static void walk(int x,int y) {
		System.out.println("Walk : "+(x+y));
	}
}