package oops;

public class Arithmatic {
	
	//Characteristics or state
	int a=10;
	int b=20;
	boolean bFlag=false;
	
	
	//Behavior
	public void Addition() // Name of the method is - Addition
	{
		//method body
		int c = a+b;
		System.out.println("Addition of a and b is : " + c);
	}
	
	public void Subtraction() // Name of the method is - Addition
	{
		int c = a-b;
		System.out.println("Subtraction of a and b is : " + c);
	}
	
	
	public void Multiplication() // Name of the method is - Addition
	{
		int c = a*b;
		System.out.println("Multiplication of a and b is : " + c);
	}
	
	public void Division() // Name of the method is - Addition
	{
		int c = b/a;
		System.out.println("Division of a and b is : " + c);
	}
	
	public void Modulus() // Name of the method is - Addition
	{
		int c = b%a;
		System.out.println("Modulus of a and b is : " + c);
	}
	

	public static void main(String[] args) 
	{
		// Classname objectname = new Constructorname();
		Arithmatic arithmatic = new Arithmatic(); // Created an object for the class Arithmatic
		arithmatic.Addition();
		arithmatic.Subtraction();
		arithmatic.Multiplication();
		arithmatic.Division();
		arithmatic.Modulus();
		System.out.println(arithmatic.a);
		System.out.println(arithmatic.b);
		System.out.println(arithmatic.bFlag);

	}

}
