package www.jca.com;

public class MainClass {

	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		int i, j;
		
		for(i=5; i>0; i--) {
			for(j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
