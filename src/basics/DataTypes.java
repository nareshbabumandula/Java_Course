package basics;

public class DataTypes {

	public static void main(String[] args) {
		
		
		// Primitive data types
		int a =32728;
		float b= 12.6f;
		char c= 'f';
		double d=23.34235;
		long e =322352656;
		boolean f = true;
		boolean g = false;
		byte h = 127;		
		short i = 31100;
		
		System.out.println("Integer value of a is : " + a);
		System.out.println("Float value of b is : " + b);
		System.out.println("Char value of c is : " + c);
		System.out.println("Double value of d is : " + d);
		System.out.println("Long value of e is : " + e);
		System.out.println("Boolean value of f is : " + f);
		System.out.println("Boolean value of g is : " + g);
		System.out.println("Short value of i is : " + i);
		System.out.println("Byte value of h is : " + h);

		// Non-primitive data types
		
		String sText = "hello world";
		System.out.println(sText);
		
		int Marks[] = {30,89,50,40,75};
		System.out.println(Marks[0]);
		System.out.println(Marks[1]);
		System.out.println(Marks[2]);
		
		
		//Data conversions
		
		// Narrowing conversion
		// Convert data to another type that has the fewer bits of storage and/or can lose information. E.g.,
		// E.g. double or float to any integer type double to float
		
		short a1 = 130;
		byte b1 = (byte) a1;
		System.out.println("Casted value from short to byte is : " + b1);
						
		// Widening conversion -Convert data to another type that has the same or more bits of storage. E.g.,
		//• short to int, long (safe), • int to long (safe), • int to float, double (magnitude the same but can lose precision)
		
		byte b2 = 120;
		short s2 = b2;
		System.out.println("Store value from byte to short is : " + s2);

	}

}
