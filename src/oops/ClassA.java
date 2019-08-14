package oops;

public class ClassA {

	String USERNAME = "mounika123";
	String PASSWORD = "Secure*1234";
	
	public void AccessSite()
	{
		System.out.println("Successfully accessed the site");
	}

	public void CloseBrowser()
	{
		System.out.println("Successfully closed the browser");
	}

	public void LaunchBrowser()
	{
		System.out.println("Successfully launched the browser");
	}

	public static void main(String[] args) {

		ClassA obj = new ClassA();
		obj.LaunchBrowser();
		obj.AccessSite();
		obj.CloseBrowser();


	}

}
