package control.statements;

public class DoLoopTest {

	public static void main(String[] args) {
		
		int i=0;
		do {
			System.out.println("Value of i is : " + i);
			i=i+1;
			if (i==44) {
				break;
			}
		} while (i<10);

	}

}
