package control.statements;

public class ForEachTest {

	public static void main(String[] args) 
	{
		String[] strNames = {"manasa","mounika","teja","prasanna","udaya","swathi","nikitha"};
		
		for (String name : strNames) 
		{
			System.out.println(name + " - " + name.length());
		}

	}

}
